package aula20210621.usandoThrows;

public class AppThrows {

	public static void main(String[] args) throws Exception {

		try {
			String nome = recuperarNome();
			System.out.println(nome);			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Opa, deu erro aqui!");
		}
	}

	private static String recuperarNome() throws Exception {
		String nome = "Sei Lá";

		if (System.currentTimeMillis() % 2 == 0) {
			throw new Exception("Opa, em milissegundo par não pode!");
		}

		return nome;
	}
}
