package aula20210310.caixaComMedidasConcluído;


public class AppCaixaComMedidas {
	
	//+ main(args : String[]) : void
	//------------------------------    ==> sublinhado indica static
	public static void main(String[] args) {
		Livro miniBíblia = new Livro("Mini Bíblia Sagrada", 5, 50, 100);
		Livro bigJava = new Livro("Big Java 5ª edição revista e ampliada", 25, 200, 280);		
		CaixaComMedidas caixinha = new CaixaComMedidas(20, 400, 300);
		

		//adicionarLivroNaCaixa(bigJava, caixinha);
		caixinha.adicionarLivro(bigJava);
		System.out.println("O conteúdo da caixinha é: " + caixinha.getConteúdo());
	

		//adicionarLivroNaCaixa(miniBíblia, caixinha);
		caixinha.adicionarLivro(miniBíblia);
		System.out.println("O conteúdo da caixinha é: " + caixinha.getConteúdo());
	}

}
