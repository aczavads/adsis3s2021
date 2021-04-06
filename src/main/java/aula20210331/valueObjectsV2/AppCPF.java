package aula20210331.valueObjectsV2;

public class AppCPF {
	
	public static void main(String[] args) {
		try {
			CPF cpf1 = new CPF("782.311.500-05");
			System.out.println(cpf1.getValor() + " é válido!");
		} catch (CpfIválidoException exceçãoOcorrida) {
			System.out.println("Opa, cpf1 inválido! Valor = " +  exceçãoOcorrida.getCpfInválido());
		}

		try {
			CPF cpf2 = new CPF("782.311.500-99");
			System.out.println(cpf2.getValor() + " é válido!");
		} catch (CpfIválidoException exceçãoOcorrida) {
			System.out.println("Opa, cpf2 inválido! Valor = " +  exceçãoOcorrida.getCpfInválido());
		}

		System.out.println("Fim.");
	}

}
