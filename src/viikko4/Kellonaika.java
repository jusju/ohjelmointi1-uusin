package viikko4;

import java.util.Scanner;

public class Kellonaika {
	// METODIN MÄÄRITYS - ALKAA AINA PUBLIC SANALLA
	// EI PARAMETREJÄ
	public String kysyKellonaika() {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna kellonaika muodossa tt:mm: ");
		String aikarivi = lukija.nextLine();
		return aikarivi;
	}
	// METODIN MÄÄRITYS, YHDELLÄ PARAMETRILLÄ
	public boolean tarkastaKellonaika(String kellonaika) {
		return true;
	}
	public static void main(String[] args) {
		// METODIN KUTSUMISEKSI ON ENSIN LUOTAVA TÄSTÄ LUOKASTA OLIO 
		Kellonaika olio = new Kellonaika();
		// KUTSUTAAN METODIA KYSYKELLONAIKA
		String aikasyote = olio.kysyKellonaika();
		// MUISTA AINA KOKEILLA VAIHEITTAIN - PALASTELE
		System.out.println(aikasyote);
		//Metodi kysyy ja palauttaa käyttäjän antaman kellonajan. Käyttäjän antama kellonaika luetaan merkkijono-muuttujaan.
		
		
	}

}
