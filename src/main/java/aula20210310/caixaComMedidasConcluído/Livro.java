package aula20210310.caixaComMedidasConcluído;

public class Livro {
	//- larguraEmMM : int
	private int larguraEmMM;
	
	//- alturaEmMM : int
	private int alturaEmMM;
	
	//- comprimentoEmMM : int
	private int comprimentoEmMM;
	
	//- título : String
	private String título;
	
	
	//new Livro("Mini Bíblia Sagrada", 5, 50, 100);
	public Livro(String título, int alturaEmMM, int larguraEmMM, int comprimentoEmMM) {
		this.título = título;
		this.alturaEmMM = alturaEmMM;
		this.larguraEmMM = larguraEmMM;
		this.comprimentoEmMM = comprimentoEmMM;			
	}
	
	//getter para larguraMeMM
	public int getLarguraEmMM() {
		return this.larguraEmMM;
	}
	
	public int getAlturaEmMM() {
		return alturaEmMM;
	}
	
	public int getComprimentoEmMM() {
		return comprimentoEmMM;
	}
	
	public String getTítulo() {
		return título;
	}	

}
