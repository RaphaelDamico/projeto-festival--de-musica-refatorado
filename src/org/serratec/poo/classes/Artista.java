package org.serratec.poo.classes;

public abstract class Artista {
	private String nome;
	private Genero genero;
	private double cache;

	public Artista(String nome, Genero genero, double cache) {
		this.nome = nome;
		this.genero = genero;
		this.cache = cache;
	}

	public String getNome() {
		return nome;
	}

	public Genero getGenero() {
		return genero;
	}

	public double getCache() {
		return cache;
	}

	@Override
	public String toString() {
		return String.format("""
				%s
				Genero musical: %s
				Cachê: R$%.2f
				""", nome, genero, cache);
	}

}
