package aula20210322.carro;

import javax.swing.JOptionPane;

public class AppCarroTryCatch {
	
	public static void main(String[] args) {
		long início = System.currentTimeMillis();
		
		JOptionPane.showMessageDialog(null, "Iniciando a aplicação..");
		
		try {
			Carro novo = new Carro();
			novo.desligar();		
			System.out.println("Opa, desligou!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Opa, erro ao desligar o carro... Será que já estava desligado?");
		}
		
		long fim = System.currentTimeMillis();
		System.out.println("Terminando execução com sucesso! Tempo de execução = " + (fim-início) + "ms.");
	}

}
