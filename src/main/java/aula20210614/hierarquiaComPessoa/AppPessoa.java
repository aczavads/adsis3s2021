package aula20210614.hierarquiaComPessoa;

public class AppPessoa {

	public static void main(String[] args) {
		try {
			PessoaRepository repo = new PessoaRepository();
			
			PessoaFísica ana = new PessoaFísica(55, "Ana Maria", new CPF("545.788.865-14"));
			PessoaFísica joaquim = new PessoaFísica(77, "Joaquim Silva", new CPF("123.544.865-55"));
			PessoaJurídica ibm = new PessoaJurídica(21, "IBM iNC.", new CNPJ("54.554.554/0001-33"));
			
			repo.incluir(ana);
			repo.incluir(joaquim);
			repo.incluir(ibm);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Pronto!");
	}
}
