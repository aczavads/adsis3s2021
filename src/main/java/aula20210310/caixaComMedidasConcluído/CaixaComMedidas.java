package aula20210310.caixaComMedidasConcluído;

public class CaixaComMedidas {
	//- conteúdo : Object
	private Object conteúdo;
	
	//- larguraEmMM : int
	private int larguraEmMM;
	
	//- alturaEmMM : int
	private  int alturaEmMM;
	
	//- comprimentoEmMM : int
	private int comprimentoEmMM;
	
	
	//new CaixaComMedidas(20, 400, 300);
	public CaixaComMedidas(int alturaEmMM, int larguraEmMM, int comprimentoEmMM) {
		if (alturaEmMM <= 0) {
			throw new RuntimeException("Altura deve ser maior que zero!");
		}
		if (comprimentoEmMM <= 0) {
			throw new RuntimeException("Comprimento deve ser maior que zero!");
		}
		if (larguraEmMM <= 0) {
			throw new RuntimeException("Largura deve ser maior que zero!");
		}
		this.alturaEmMM = alturaEmMM;
		this.larguraEmMM = larguraEmMM;
		this.comprimentoEmMM = comprimentoEmMM;
	}
	
	public void adicionarLivro(Livro livroParaAdicionar) {
		if (livroParaAdicionar.getAlturaEmMM() <= this.alturaEmMM 
				&& livroParaAdicionar.getLarguraEmMM() <= this.larguraEmMM 
				&& livroParaAdicionar.getComprimentoEmMM() <= this.comprimentoEmMM) {
			this.conteúdo = livroParaAdicionar;
		} else {
			System.out.println("Opa, livro excedeu alguma dimensão da caixa!");
		}				
	}
	
	public int getAlturaEmMM() {
		return alturaEmMM;
	}
	
	public int getComprimentoEmMM() {
		return comprimentoEmMM;
	}
	public Object getConteúdo() {
		return conteúdo;
	}
	public int getLarguraEmMM() {
		return larguraEmMM;
	}

}
