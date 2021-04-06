package aula20210405.cnpj;

public class AppCNPJ {
	
	public static void main(String[] args) {
		try {
			CNPJ cnpj1 = new CNPJ("79.265.617/0001-99");
			System.out.println(cnpj1.getValor() + " é válido!");
		} catch (CnpjIválidoException exceçãoOcorrida) {
			System.out.println("Opa, cnpj1 inválido! Valor = " +  exceçãoOcorrida.getCpfInválido());
		}

		try {
			CNPJ cnpj2 = new CNPJ("22.123.617/0001-99");
			System.out.println(cnpj2.getValor() + " é válido!");
		} catch (CnpjIválidoException exceçãoOcorrida) {
			System.out.println("Opa, cnpj2 inválido! Valor = " +  exceçãoOcorrida.getCpfInválido());
		}

		System.out.println("Fim.");
	}

}
