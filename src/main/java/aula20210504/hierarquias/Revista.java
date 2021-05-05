package aula20210504.hierarquias;

public class Revista extends Publicação {
	private int número;

	public Revista(String título, int número) {
		super(título);
		this.número = número;
	}
	
	public void setNúmero(int número) {
		this.número = número;
	}
	public int getNúmero() {
		return número;
	}
	
	@Override
	public String getTítulo() {
		return "<<" + super.getTítulo().toUpperCase() + ">>";
	}

}
