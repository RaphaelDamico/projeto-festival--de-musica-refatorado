package org.serratec.poo.principal;

import java.time.LocalDateTime;

import org.serratec.poo.classes.Artista;
import org.serratec.poo.classes.Banda;
import org.serratec.poo.classes.Cantor;
import org.serratec.poo.classes.Dj;
import org.serratec.poo.classes.Genero;
import org.serratec.poo.classes.Grupo;
import org.serratec.poo.classes.Palco;

public class TestaFestival {

	public static void main(String[] args) {
		
		Artista c1 = new Cantor("Alcione", Genero.SAMBA, 200000.00, false);
		Artista c2 = new Cantor("Jorge Aragão", Genero.SAMBA, 150000.00, false);
		Artista c3 = new Cantor("Seu Jorge", Genero.MPB, 130000.00, false);
		Artista c4 = new Cantor("Zeze de Camargo e Luciano", Genero.SERTANEJO, 500000.00, true);
		Artista b1 = new Banda("Coldplay", Genero.ROCK, 1000000.00, 4, true);
		Artista b2 = new Banda("Maroon 5", Genero.ROCK, 1500000.00, 5, false);
		Artista b3 = new Banda("U2", Genero.ROCK, 2000000.00, 4, true);
		Artista b4 = new Banda("Queen", Genero.ROCK, 10000000.00, 4, true);
		Artista g1 = new Grupo("Black Eyed Peas", Genero.HIPHOP, 1500000.00, 4);
		Artista g2 = new Grupo("Little Mix", Genero.HIPHOP, 500000.00, 6);
		Artista g3 = new Grupo("BTS (Bangtan Boys)", Genero.POP, 200000.00, 2);
		Artista g4 = new Grupo("LMFAO", Genero.POP, 500000.00, 4);
		Artista d1 = new Dj("Martin Garrix", Genero.ELETRO, 1000000.00, true);
		Artista d2 = new Dj("Calvin Harris", Genero.ELETRO, 2000000.00, true);
		Artista d3 = new Dj("MSteve Aoki", Genero.ELETRO, 3000000.00, true);
		Artista d4 = new Dj("Zedd", Genero.ELETRO, 1500000.00, true);

		Palco palco1 = new Palco(" Palco Mundo");
		Palco palco2 = new Palco(" Palco Sunset");
		Palco palco3 = new Palco(" Palco Samsung Galaxy");
		Palco palco4 = new Palco(" Palco Budweiser");

		palco1.horaDoShow(150000, LocalDateTime.of(2024, 5, 20, 20, 00), c1);
		palco1.horaDoShow(150000, LocalDateTime.of(2024, 5, 20, 21, 00), b1);
		palco1.horaDoShow(150000, LocalDateTime.of(2024, 5, 20, 22, 00), g1);
		palco1.horaDoShow(150000, LocalDateTime.of(2024, 5, 20, 23, 00), d1);
		palco2.horaDoShow(100000, LocalDateTime.of(2024, 5, 21, 20, 00), c2);
		palco2.horaDoShow(100000, LocalDateTime.of(2024, 5, 21, 21, 00), b2);
		palco2.horaDoShow(100000, LocalDateTime.of(2024, 5, 21, 22, 00), g2);
		palco2.horaDoShow(100000, LocalDateTime.of(2024, 5, 21, 23, 00), d2);
		palco3.horaDoShow(120000, LocalDateTime.of(2024, 5, 22, 20, 00), c3);
		palco3.horaDoShow(120000, LocalDateTime.of(2024, 5, 22, 21, 00), b3);
		palco3.horaDoShow(120000, LocalDateTime.of(2024, 5, 22, 22, 00), g3);
		palco3.horaDoShow(120000, LocalDateTime.of(2024, 5, 22, 23, 00), d3);
		palco4.horaDoShow(110000, LocalDateTime.of(2024, 5, 23, 20, 00), c4);
		palco4.horaDoShow(110000, LocalDateTime.of(2024, 5, 23, 21, 00), b4);
		palco4.horaDoShow(110000, LocalDateTime.of(2024, 5, 23, 22, 00), g4);
		palco4.horaDoShow(110000, LocalDateTime.of(2024, 5, 23, 23, 00), d4);

		palco1.exibeDadosEvento();
		palco2.exibeDadosEvento();
		palco3.exibeDadosEvento();
		palco4.exibeDadosEvento();
	}

}
