package aula20210614.entidadesComSuperclasses;

import java.util.UUID;

public abstract class Computador {
	private String id;
	
	public Computador() {
		this.id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
}
