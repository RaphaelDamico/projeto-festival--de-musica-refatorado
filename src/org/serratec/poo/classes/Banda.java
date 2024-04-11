package org.serratec.poo.classes;

public class Banda extends Artista {
	private int quantidadeMembros;
	private boolean temTeclado;

	public Banda(String nome, Genero genero, double cache, int quantidadeMembros, boolean temTeclado) {
		super(nome, genero, cache);
		this.quantidadeMembros = quantidadeMembros;
		this.temTeclado = temTeclado;
	}

	public int getQuantidadeMembros() {
		return quantidadeMembros;
	}

	public boolean isTemTeclado() {
		return temTeclado;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("""
				Quantidade de membros da banda: %d
				""", quantidadeMembros);
	}

}
