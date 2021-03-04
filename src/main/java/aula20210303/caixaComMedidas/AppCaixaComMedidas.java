package aula20210303.caixaComMedidas;


public class AppCaixaComMedidas {
	
	//+ main(args : String[]) : void
	//------------------------------    ==> sublinhado indica static
	public static void main(String[] args) {
		Livro miniBíblia = new Livro();
		miniBíblia.título = "Mini Bíblia Sagrada";
		miniBíblia.alturaEmMM = 5;
		miniBíblia.larguraEmMM = 50;
		miniBíblia.comprimentoEmMM = 100;

		Livro bigJava = new Livro();
		bigJava.título = "Big Java 5ª edição revista e ampliada";
		bigJava.alturaEmMM = 25;
		bigJava.larguraEmMM = 200;
		bigJava.comprimentoEmMM = 280;
		
		CaixaComMedidas caixinha = new CaixaComMedidas();
		caixinha.alturaEmMM = 20;
		caixinha.larguraEmMM = 400;
		caixinha.comprimentoEmMM = 300;
		

		//implementar o teste que impeça um livro que não caiba na caixa de ser a ela adicionado.
		caixinha.conteúdo = bigJava;
		
		
		System.out.println("O conteúdo da caixinha é: " + caixinha.conteúdo);
		
		
	}

}
