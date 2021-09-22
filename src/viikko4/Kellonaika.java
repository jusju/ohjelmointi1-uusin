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
		// TUTKITAAN KELLONAJAN MUOTO
		if(kellonaika.matches("\\d{2}:\\d{2}")) {
			// SPLITATAAN KELLONAIKA : MERKIN KOHDALTA
			String[] solut = kellonaika.split(":");
			int tunnit = Integer.parseInt(solut[0]);
			int minuutit = Integer.parseInt(solut[1]);
			if(tunnit >= 0 && tunnit < 24 && minuutit >= 0 && minuutit < 60) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		// METODIN KUTSUMISEKSI ON ENSIN LUOTAVA TÄSTÄ LUOKASTA OLIO 
		Kellonaika olio = new Kellonaika();
		// KUTSUTAAN METODIA KYSYKELLONAIKA
		String aikasyote = olio.kysyKellonaika();
		// METODIN KUTSUMINEN PARAMETRILLÄ
		if(olio.tarkastaKellonaika(aikasyote) == true) {
			System.out.println("Kellonaika on oikein");
		} else {
			System.out.println("Kellonaika on väärin");
		}
		//Metodi kysyy ja palauttaa käyttäjän antaman kellonajan. Käyttäjän antama kellonaika luetaan merkkijono-muuttujaan.
		//Kellonaika on oikein
		
	}

}
