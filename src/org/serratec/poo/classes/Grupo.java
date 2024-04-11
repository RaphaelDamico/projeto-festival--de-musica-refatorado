package org.serratec.poo.classes;

public class Grupo extends Artista {
	private int quantidadeDeDancarinos;

	public Grupo(String nome, Genero genero, double cache, int quantidadeDeDancarinos) {
		super(nome, genero, cache);
		this.quantidadeDeDancarinos = quantidadeDeDancarinos;
	}

	public int getQuantidadeDeDancarinos() {
		return quantidadeDeDancarinos;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("""
				Quantidade de dançarinos no grupo: %d
				""", quantidadeDeDancarinos);
	}
}
