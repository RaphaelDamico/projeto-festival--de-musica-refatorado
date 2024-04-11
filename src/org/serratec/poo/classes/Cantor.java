package org.serratec.poo.classes;

public class Cantor extends Artista {
	private boolean temSegundaVoz;

	public Cantor(String nome, Genero genero, double cache, boolean temSegundaVoz) {
		super(nome, genero, cache);
		this.temSegundaVoz = temSegundaVoz;
	}

	public boolean isTemSegundaVoz() {
		return temSegundaVoz;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
