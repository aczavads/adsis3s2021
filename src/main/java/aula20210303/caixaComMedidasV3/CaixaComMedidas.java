package aula20210303.caixaComMedidasV3;

public class CaixaComMedidas {
	//+ conteúdo : Object
	public Object conteúdo;
	
	//+ larguraEmMM : int
	public int larguraEmMM;
	
	//+ alturaEmMM : int
	public int alturaEmMM;
	
	//+ comprimentoEmMM : int
	public int comprimentoEmMM;
	
	
	public void adicionarLivro(Livro livroParaAdicionar) {
		if (livroParaAdicionar.alturaEmMM <= this.alturaEmMM 
				&& livroParaAdicionar.larguraEmMM <= this.larguraEmMM 
				&& livroParaAdicionar.comprimentoEmMM <= this.comprimentoEmMM) {
			this.conteúdo = livroParaAdicionar;
		} else {
			System.out.println("Opa, livro excedeu alguma dimensão da caixa!");
		}				
	}


}
