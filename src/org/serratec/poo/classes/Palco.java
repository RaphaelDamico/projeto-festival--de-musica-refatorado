package org.serratec.poo.classes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Palco {
	private String nomeDoPalco;
	private List<Evento> eventos = new ArrayList<>();
	
	public Palco(String nomeDoPalco) {
		this.nomeDoPalco = nomeDoPalco;
	}

	public String getNomeDoPalco() {
		return nomeDoPalco;
	}

	public List<Evento> getEvento() {
		return eventos;
	}
	
	public void horaDoShow(int capacidade, LocalDateTime horarios, Artista artista) {
		Evento evento = new Evento(capacidade, horarios, artista);
		eventos.add(evento);
	}
	
	public void exibeDadosEvento() {
		System.out.println(getNomeDoPalco());
		for (Evento eventos : eventos) {
			System.out.println(eventos);
		}
		System.out.println("\n");	
	}
	
	@Override
	public String toString() {
		return String.format("""
				Nome do Palco: %s
				Horários dos eventos: %s
				""",nomeDoPalco, eventos);
	}
	
	
}
