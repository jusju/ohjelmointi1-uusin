package viikko4;

import java.util.Scanner;

public class Kellonaika {
	// METODIN M��RITYS - ALKAA AINA PUBLIC SANALLA
	// EI PARAMETREJ�
	public String kysyKellonaika() {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna kellonaika muodossa tt:mm: ");
		String aikarivi = lukija.nextLine();
		return aikarivi;
	}
	// METODIN M��RITYS, YHDELL� PARAMETRILL�
	public boolean tarkastaKellonaika(String kellonaika) {
		return true;
	}
	public static void main(String[] args) {
		// METODIN KUTSUMISEKSI ON ENSIN LUOTAVA T�ST� LUOKASTA OLIO 
		Kellonaika olio = new Kellonaika();
		// KUTSUTAAN METODIA KYSYKELLONAIKA
		String aikasyote = olio.kysyKellonaika();
		// MUISTA AINA KOKEILLA VAIHEITTAIN - PALASTELE
		System.out.println(aikasyote);
		//Metodi kysyy ja palauttaa k�ytt�j�n antaman kellonajan. K�ytt�j�n antama kellonaika luetaan merkkijono-muuttujaan.
		
		
	}

}
