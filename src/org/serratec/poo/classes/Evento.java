package org.serratec.poo.classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Evento {
	private int capacidade;
	private LocalDateTime horarios;
	private Artista artista;

	public Evento(int capacidade, LocalDateTime horarios, Artista artista) {
		this.capacidade = capacidade;
		this.horarios = horarios;
		this.artista = artista;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public LocalDateTime getHorarios() {
		return horarios;
	}

	public Artista getArtista() {
		return artista;
	}

	@Override
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return String.format("""
				Artista: %s
				Data e hora: %s
				Capacidade do evento: %d pessoas
				xxxxxxxxxxxxxxxxxxxxx
				""", artista, fmt.format(horarios), capacidade);
	}

}
