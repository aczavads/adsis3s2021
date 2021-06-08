package aula20210601.associações;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.swing.JOptionPane;

public class AppAssociações {
	
	public static void main(String[] args) {
		try {
//			Connection conexão = DriverManager.getConnection("jdbc:h2:~/transações2", "sa", "");
//			conexão.close();
			Connection conexão = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/transações2", "sa", "");
			conexão.setAutoCommit(false);
			
			criarTabelaLivro(conexão);
			criarTabelaAutor(conexão);
			criarTabelaAutorLivro(conexão);
			
			String idAna = UUID.randomUUID().toString();
			String idCarlos = UUID.randomUUID().toString();
			inserirUmAutor(conexão, idAna, "Ana Maria de Almeida");
			inserirUmAutor(conexão, idCarlos, "Carlos Eduardo Bandeira");
			
			String idNovaCozinha = UUID.randomUUID().toString();
			String idChurrascoArgentino = UUID.randomUUID().toString();
			inserirUmLivro(conexão, idNovaCozinha, "Nova cozinha moderna v33", false, 425.12, 400, new Date());
			inserirUmLivro(conexão, idChurrascoArgentino, "Churrasco Argentino3", false, 300.00, 200, new Date());
			
			inserirUmAutorLivro(conexão, idAna, idChurrascoArgentino);
			inserirUmAutorLivro(conexão, idCarlos, idChurrascoArgentino);
			
			inserirUmAutorLivro(conexão, idAna, idNovaCozinha);			
			conexão.commit();
			//Atividade: implementar um método que recupere os autores de um livro com base neste select:
			/*SELECT L.TITULO, A.NOME 
                        FROM LIVRO L 
              INNER JOIN AUTOR_LIVRO AL ON AL.LIVRO_ID = L.ID 
              INNER JOIN AUTOR A ON AL.AUTOR_ID = A.ID			 
              */
			List<String> nomesDosAutores = recuperarNomesDosAutores(conexão, idChurrascoArgentino);
			for (String nomeDoAutor : nomesDosAutores) {
				System.out.println("> " + nomeDoAutor);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Foi.");
	}
	
	private static List<String> recuperarNomesDosAutores(Connection conexão, String idLivro) throws SQLException {
		List<String> nomesDosAutores = new ArrayList<>();
		String select = "SELECT L.TITULO, A.NOME \r\n" + 
				"                        FROM LIVRO L \r\n" + 
				"                  INNER JOIN AUTOR_LIVRO AL ON AL.LIVRO_ID = L.ID \r\n" + 
				"                  INNER JOIN AUTOR A ON AL.AUTOR_ID = A.ID" +
				"                       WHERE L.ID = ?";
		PreparedStatement psSelect = conexão.prepareStatement(select);
		psSelect.setString(1, idLivro);
		ResultSet rsSelect = psSelect.executeQuery();
		while (rsSelect.next()) {
			nomesDosAutores.add(rsSelect.getString("nome"));
		}
		rsSelect.close();
		psSelect.close();
				
		return nomesDosAutores;
	}

	private static void criarTabelaAutorLivro(Connection conexão) throws SQLException {
		PreparedStatement psCreate = conexão.prepareStatement("create table if not exists autor_livro ("
				+ "livro_id char(36) references livro(id),"
				+ "autor_id char(36) references autor(id),"
				+ "primary key (livro_id, autor_id)"
				+ ")");
		psCreate.execute();
		psCreate.close();			
		conexão.commit();
	}

	private static void criarTabelaAutor(Connection conexão) throws SQLException {
		PreparedStatement psCreate = conexão.prepareStatement("create table if not exists autor ("
				+ "id char(36) primary key,"
				+ "nome varchar(255) not null"
				+ ")");
		psCreate.execute();
		psCreate.close();			
		conexão.commit();
	}



	private static void inserirMilLivros(Connection conexão) throws SQLException {
		for (int i = 0; i < 1000; i++) {
			inserirUmLivro( 
					conexão,
					UUID.randomUUID().toString(),
					"Java Como Programar: " + System.nanoTime(),
					true,
					125.77,
					275,
					new Date());
		}
		//JOptionPane.showMessageDialog(null, "Opa, mil inserts realizados, mas ainda sem commit!");
		int opção = JOptionPane.showConfirmDialog(null, "Deseja confirmar a transação?","Confirme",JOptionPane.YES_NO_OPTION);
		if (opção == JOptionPane.YES_OPTION) {
			conexão.commit();				
			System.out.println("Commit efetuado!");
		} else if (opção == JOptionPane.NO_OPTION) {
			conexão.rollback();
			System.out.println("Rollback efetuado!");
		}
	}



	private static void criarTabelaLivro(Connection conexão) throws SQLException {
		PreparedStatement psCreate = conexão.prepareStatement("create table if not exists livro ("
				+ "id char(36) primary key,"
				+ "titulo varchar(255) not null,"
				+ "ainda_publicado boolean not null,"
				+ "preco numeric(15,2) not null,"
				+ "numero_de_paginas numeric(8) not null,"
				+ "publicado_em date not null"
				+ ")");
		psCreate.execute();
		psCreate.close();			
		conexão.commit();
	}


	
	private static void inserirUmLivro(
			Connection conexão,
			String id,
			String título,
			boolean aindaPublicado,
			double preço, 
			int númeroDePáginas,
			Date publicadoEm) {
		
		try {
			PreparedStatement psInsert = conexão.prepareStatement("insert into livro "
					+ " (id, titulo, ainda_publicado, preco, numero_de_paginas, publicado_em) "
					+ " values "
					+ " ( ?,      ?,              ?,     ?,                 ?,           ?)");
			psInsert.setString(1, id);
			psInsert.setString(2, título);
			psInsert.setBoolean(3, aindaPublicado);
			psInsert.setDouble(4, preço);
			psInsert.setInt(5, númeroDePáginas);
			psInsert.setDate(6, new java.sql.Date(publicadoEm.getTime()));
			psInsert.execute();
			psInsert.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	private static void inserirUmAutor(Connection conexão, String id, String nome) {
		try {
			PreparedStatement psInsert = conexão.prepareStatement("insert into autor "
					+ " (id, nome) "
					+ " values "
					+ " ( ?,    ?)");
			psInsert.setString(1, id);
			psInsert.setString(2, nome);
			psInsert.execute();
			psInsert.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	private static void inserirUmAutorLivro(Connection conexão, String idAutor, String idLivro) {
		try {
			PreparedStatement psInsert = conexão.prepareStatement("insert into autor_livro "
					+ " (autor_id, livro_id) "
					+ " values "
					+ " (       ?,        ?)");
			psInsert.setString(1, idAutor);
			psInsert.setString(2, idLivro);
			psInsert.execute();
			psInsert.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
}

















