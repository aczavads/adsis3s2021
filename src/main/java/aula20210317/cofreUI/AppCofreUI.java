package aula20210317.cofreUI;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import aula20210315.cofre.Cofre;

public class AppCofreUI extends JDialog {
	private Cofre meuCofre = new Cofre();
	
	
	
	public AppCofreUI() {
		this.setSize(200,120);
		this.setLayout(new GridLayout(2, 1));
		
		JButton btnFecharCofre = new JButton("Fechar");
		btnFecharCofre.addActionListener( (event) -> {
			System.out.println("Clicou no fechar!");
			
			String senhaDigitada = JOptionPane.showInputDialog("Digite a senha para fechar o cofre:");
			meuCofre.fechar(senhaDigitada);
			
			System.out.println("Cofre está aberto? " + meuCofre.isAberto());
		});
		
		
		JButton btnAbrirCofre = new JButton("Abrir");
		btnAbrirCofre.addActionListener( (event) -> {
			System.out.println("Clicou no abrir!");
			
			String senhaDigitada = JOptionPane.showInputDialog("Digite a senha para abrir o cofre:");
			meuCofre.abrir(senhaDigitada);
			
			System.out.println("Cofre está aberto? " + meuCofre.isAberto());
		});
		
		this.add(btnAbrirCofre);
		this.add(btnFecharCofre);
	}
	
	public static void main(String[] args) {
		AppCofreUI app = new AppCofreUI();		
		app.setVisible(true);
	}

}
