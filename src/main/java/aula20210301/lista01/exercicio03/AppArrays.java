package aula20210301.lista01.exercicio03;

public class AppArrays {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			String valorAtual = args[i];
			System.out.println(valorAtual + ", tamanho=" + valorAtual.length());
		}
	}
}
