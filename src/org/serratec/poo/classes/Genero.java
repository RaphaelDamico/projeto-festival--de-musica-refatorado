package org.serratec.poo.classes;

public enum Genero {
	SAMBA("samba"),
	ROCK("rock"),
	POP("pop"),
	SERTANEJO("sertanejo"),
	HIPHOP("hip-hop"),
	ELETRO("summer eletro hits"),
	MPB("mpb");
	
	private String descricaoTextual;

	private Genero(String descricaoTextual) {
		this.descricaoTextual = descricaoTextual;
	}
	
	public String getDescricaoTextual() {
		return descricaoTextual;
	}

}
