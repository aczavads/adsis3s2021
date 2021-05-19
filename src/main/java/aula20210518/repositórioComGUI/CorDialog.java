package aula20210518.repositórioComGUI;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import aula20210517.repositório.Cor;
import aula20210517.repositório.CorRepository;
import aula20210517.repositório.CorRepositoryPersistent;

public class CorDialog extends JDialog {
	private CorRepository repo = new CorRepositoryPersistent();
	
	private JLabel labelSigla = new JLabel("Sigla");
	private JTextField fieldSigla = new JTextField();
	
	private JLabel labelNome = new JLabel("Nome");
	private JTextField fieldNome = new JTextField();
	
	private JButton btnIncluir = new JButton("Incluir");
	
	public CorDialog() {
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setLayout(new GridLayout(5, 1));
		this.add(labelSigla);
		this.add(fieldSigla);
		this.add(labelNome);
		this.add(fieldNome);
		this.add(btnIncluir);
		this.setSize(getPreferredSize());
		
		btnIncluir.addActionListener(e -> {
			incluirCor(fieldNome.getText(), fieldSigla.getText());
		});
	}
	
	private void incluirCor(String nome, String sigla) {
		
		Cor nova = new Cor(nome, sigla);
		repo.salvar(nova);
	}

	public static void main(String[] args) {
		CorDialog dialog = new CorDialog();
		dialog.setVisible(true);
	}

}
