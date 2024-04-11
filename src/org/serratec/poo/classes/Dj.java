package org.serratec.poo.classes;

public class Dj extends Artista {
	private boolean ehAmigoDoDavidGuetta;

	public Dj(String nome, Genero genero, double cache, boolean ehAmigoDoDavidGuetta) {
		super(nome, genero, cache);
		this.ehAmigoDoDavidGuetta = ehAmigoDoDavidGuetta;
	}

	public boolean isEhAmigoDoDavidGuetta() {
		return ehAmigoDoDavidGuetta;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
