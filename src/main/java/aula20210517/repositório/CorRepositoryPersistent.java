package aula20210517.repositório;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Para executar o banco de dados H2, copie o pathname do aquivo jar do h2 das
 * dependências do maven de seu projeto. Retire a parte do "-source" e vá para o CMD.
 * Lá digite java -jar com o path do h2.
 * 
 * Exemplo no caso do lab da UniCesumar:
 * java -jar C:/Users/ADM/.m2/repository/com/h2database/h2/1.4.200/h2-1.4.200.jar
 *  
 * @author ADM
 *
 */
public class CorRepositoryPersistent implements CorRepository {
	private Connection conexão;
	
	public CorRepositoryPersistent() {
		abrirConexão();
	}
	
	private void abrirConexão() {
		try {
			try {
				conexão = DriverManager.getConnection("jdbc:h2:~/adsis3s2021","sa","");
				conexão.close();
			} catch (Exception e) {
				System.out.println("Opa, acho que o banco já estava criado...");
			}
			conexão = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/adsis3s2021","sa","");			
			//conexão = DriverManager.getConnection("jdbc:postgresql://localhost:5432/adsis3s2021","sa","");
			//conexão = DriverManager.getConnection("jdbc:oracle://localhost:1521/adsis3s2021","sa","");
			PreparedStatement psCreateTable = conexão.prepareStatement("create table if not exists cor ("
					+ "nome varchar(255) not null, "
					+ "sigla varchar(30) not null, "
					+ "primary key(sigla)"
					+ ")");
			psCreateTable.execute();
			psCreateTable.close();
			System.out.println("Foi.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void salvar(Cor nova) {
		try {
			PreparedStatement psInsert = conexão.prepareStatement(
					"insert into cor (nome, sigla) values (?, ?)");
			psInsert.setString(1, nova.getNome());
			psInsert.setString(2, nova.getSigla());
			psInsert.execute();
			psInsert.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Cor cor) {
		try {
			PreparedStatement psUpdate = conexão.prepareStatement("update cor set nome = ? where sigla = ?");
			psUpdate.setString(1, cor.getNome());
			psUpdate.setString(2, cor.getSigla());
			psUpdate.execute();
			psUpdate.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(Cor cor) {
		try {
			PreparedStatement psDelete = conexão.prepareStatement("delete from cor where sigla = ?");
			psDelete.setString(1, cor.getSigla());
			psDelete.execute();
			psDelete.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Cor> obterTodas() {
		List<Cor> todas = new ArrayList<>();
		try {
			PreparedStatement psSelect = conexão.prepareStatement(
					"select nome, sigla from cor");
			ResultSet rsTodas = psSelect.executeQuery();
			while (rsTodas.next()) {
				Cor recuperada = new Cor(
						rsTodas.getString("nome"), 
						rsTodas.getString("sigla"));
				todas.add(recuperada);
			}
			psSelect.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return todas;
	}


}
