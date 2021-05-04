package aula20210503.hierarquias;

public class Livro extends Publicação {
	private int edição;

	public Livro(String título) {
		super(título);
	}

	public Livro(String título, int edição) {
		super(título);
		this.edição = edição;
	}

	public void setEdição(int edição) {
		this.edição = edição;
	}

	public int getEdição() {
		return edição;
	}

}
