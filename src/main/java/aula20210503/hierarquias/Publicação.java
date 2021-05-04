package aula20210503.hierarquias;

import java.util.Date;

public abstract class Publicação {
	private String título;
	private Date publicadoEm;

	public Publicação(String título) {
		this.título = título;
	}

	public Publicação(String título, Date publicadoEm) {
		this.título = título;
		this.publicadoEm = publicadoEm;
	}
	
	public String getTítulo() {
		return título;
	}
	public Date getPublicadoEm() {
		return publicadoEm;
	}
}
