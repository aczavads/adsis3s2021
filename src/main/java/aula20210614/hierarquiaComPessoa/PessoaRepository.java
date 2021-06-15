package aula20210614.hierarquiaComPessoa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PessoaRepository {
	private Connection conexão;
	
	
	public PessoaRepository() throws Exception {
		try {
			conexão = DriverManager.getConnection("jdbc:h2:~/pessoa","sa","");
			conexão.close();
		} catch (Exception e) {
			System.out.println("Opa, acho que o banco já estava criado...");
		}
		conexão = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/pessoa","sa","");
		conexão.setAutoCommit(false);
		criarTabelas();
	}


	private void criarTabelas() throws Exception {
		String sqlCreatePessoa = "create table if not exists Pessoa ("
				+ "id numeric(18) not null primary key,"
				+ "nome varchar(255) not null, "
				+ "tipo_pessoa varchar(50) not null"
				+ ")";

		String sqlCreateFisica = "create table if not exists PessoaFisica ("
				+ "id numeric(18) not null primary key references Pessoa(id), "
				+ "cpf varchar(50) not null unique"
				+ ")";

		String sqlCreateJurísica = "create table if not exists PessoaJuridica ("
				+ "id numeric(18) not null primary key references Pessoa(id), "
				+ "cnpj varchar(50) not null unique"
				+ ")";
		conexão.createStatement().execute(sqlCreatePessoa);
		conexão.createStatement().execute(sqlCreateFisica);
		conexão.createStatement().execute(sqlCreateJurísica);
		conexão.commit();
	}
	
	public void incluir(Pessoa pessoa) throws Exception {
		conexão.rollback();
		try {
			PreparedStatement psInsertPessoa = conexão.prepareStatement(
					"insert into pessoa (id, nome, tipo_pessoa) values (?,?,?)");

			PreparedStatement psInsertFisica = conexão.prepareStatement(
					"insert into pessoafisica (id, cpf) values (?,?)");

			PreparedStatement psInsertJuridica = conexão.prepareStatement(
					"insert into pessoajuridica (id, cnpj) values (?,?)");
			
			psInsertPessoa.setLong(1, pessoa.getId());
			psInsertPessoa.setString(2, pessoa.getNome());
			if (pessoa instanceof PessoaFísica) {
				psInsertPessoa.setString(3, "FISICA");		
			} else if (pessoa instanceof PessoaJurídica) {
				psInsertPessoa.setString(3, "JURIDICA");
			}
			psInsertPessoa.execute();
			
			if (pessoa instanceof PessoaFísica) {
				psInsertFisica.setLong(1, pessoa.getId());
				psInsertFisica.setString(2, ((PessoaFísica) pessoa).getCpf().getValor());
				psInsertFisica.execute();
			} else if (pessoa instanceof PessoaJurídica) {
				psInsertJuridica.setLong(1, pessoa.getId());
				psInsertJuridica.setString(2, ((PessoaJurídica) pessoa).getCnpj().getValor());
				psInsertJuridica.execute();
			}
			conexão.commit();			
		} catch (Exception e) {
			conexão.rollback();
			e.printStackTrace();
		}
	}

}


