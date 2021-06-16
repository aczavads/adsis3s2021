package aula20210614.hierarquiaComPessoa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	
	public Pessoa recuperarPeloId(long id) throws Exception {
		conexão.rollback();
		Pessoa recuperada = null;
		try {
			PreparedStatement psSelectPessoa = conexão.prepareStatement("select id, nome, tipo_pessoa from pessoa where id = ?");
			PreparedStatement psSelectFísica = conexão.prepareStatement("select id, cpf from pessoafisica where id = ?");
			PreparedStatement psSelectJurídica = conexão.prepareStatement("select id, cnpj from pessoajuridica where id = ?");
			
			psSelectPessoa.setLong(1, id);
			ResultSet rsPessoa = psSelectPessoa.executeQuery();
			if (rsPessoa.next()) {
				String nome = rsPessoa.getString("nome");
				String tipoPessoa = rsPessoa.getString("tipo_pessoa");
				if (tipoPessoa.equals("FISICA")) {
					psSelectFísica.setLong(1, id);
					ResultSet rsFísica = psSelectFísica.executeQuery();
					if (rsFísica.next()) {
						recuperada = new PessoaFísica(id, nome, new CPF(rsFísica.getString("cpf")));
						return recuperada;
					}
				} else if (tipoPessoa.equals("JURIDICA")) {
					psSelectJurídica.setLong(1, id);
					ResultSet rsJurídica = psSelectJurídica.executeQuery();
					if (rsJurídica.next()) {
						recuperada = new PessoaJurídica(id, nome, new CNPJ(rsJurídica.getString("cnpj")));
						return recuperada;
					}
				}
			} else {
				throw new RuntimeException("Pessoa não encontrada!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return recuperada;
	}

	public void excluirPeloId(long id) throws Exception {
		conexão.rollback();
		try {			
			PreparedStatement psDeletePessoa = conexão.prepareStatement("delete from pessoa where id = ?");
			PreparedStatement psDeleteFísica = conexão.prepareStatement("delete from pessoafisica where id = ?");
			PreparedStatement psDeleteJurídica = conexão.prepareStatement("delete from pessoajuridica where id = ?");
			
			psDeletePessoa.setLong(1, id);
			psDeleteFísica.setLong(1, id);
			psDeleteJurídica.setLong(1, id);

			Pessoa recuperada = recuperarPeloId(id);
			if (recuperada instanceof PessoaFísica) {
				psDeleteFísica.execute();
			} else if (recuperada instanceof PessoaJurídica) {
				psDeleteJurídica.execute();				
			}
			psDeletePessoa.execute();
			
			psDeleteFísica.close();
			psDeleteJurídica.close();
			psDeletePessoa.close();			
			conexão.commit();
		} catch (Exception e) {
			conexão.rollback();
			e.printStackTrace();
		}
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


