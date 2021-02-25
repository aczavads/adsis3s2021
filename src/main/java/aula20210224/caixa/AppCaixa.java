package aula20210224.caixa;

public class AppCaixa {
	
	public static void main(String[] args) {
		//declarando a variável "salário" do tipo "double"
		//e atribuindo 10 milhões e vinte centavos para "salário"
		double salario = 10_000_000.20;
		
		//declarando a variável "caixaRosa" do tipo "Caixa"
		//e atribuindo uma nova caixa (criando a caixa) para "caixaRosa"
		Caixa caixaRosa = new Caixa();
		caixaRosa.conteúdoDaCaixa = new Elefante();
		
		//declarando a variável "caixaPequena" do tipo "Caixa"
		//e atribuindo uma nova caixa (criando a caixa) para "caixaPequena"
		Caixa caixaPequena = new Caixa();
		caixaPequena.conteúdoDaCaixa = caixaRosa;

		//if (caixaRosa.conteúdoDaCaixa == null) {
		if (caixaRosa.estáVazia()) {
			System.out.println("Caixa rosa está vazia!");
		} else {
			System.out.println("Caixa rosa está cheia!");
		}		
	}
}
