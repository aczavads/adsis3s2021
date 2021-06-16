package aula20210614.hierarquiaComPessoa;

import javax.swing.JOptionPane;

public class AppPessoa {

	public static void main(String[] args) {
		try {
			PessoaRepository repo = new PessoaRepository();
			repo.excluirPeloId(55);
			repo.excluirPeloId(77);
			repo.excluirPeloId(21);
			
			PessoaFísica ana = new PessoaFísica(55, "Ana Maria", new CPF("545.788.865-14"));
			PessoaFísica joaquim = new PessoaFísica(77, "Joaquim Silva", new CPF("123.544.865-55"));
			PessoaJurídica ibm = new PessoaJurídica(21, "IBM iNC.", new CNPJ("54.554.554/0001-33"));
			
			repo.incluir(ana);
			repo.incluir(joaquim);
			repo.incluir(ibm);
			
			JOptionPane.showConfirmDialog(null, "Opa, incluídos!");			
			Pessoa recuperadaPeloId = repo.recuperarPeloId(21);
			System.out.println("Pessoa recuperada pelo id: " 
					+ recuperadaPeloId.getNome() + "  "
					+ recuperadaPeloId.getId() + "  "
					+ recuperadaPeloId.getClass());
			JOptionPane.showConfirmDialog(null, "Vamos excluir o 21!");	
			repo.excluirPeloId(21);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Pronto!");
	}
}
