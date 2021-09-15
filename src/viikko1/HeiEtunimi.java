package viikko1;

import java.util.Scanner;

public class HeiEtunimi {

	public static void main(String[] args) {
		// SKANNERIN LUONTI JA CTRL S MUISTISAANTO ON
		// ETTA KOLME KIRJAINTA JA CTRL + SPACE
		Scanner lukija = new Scanner(System.in);
		// NÄYTÖLLE TULOSTUS ELI KÄYTTÄJÄLTÄ KYSYTÄÄN
		System.out.print("Syötä etunimi: ");
		// STRING-MUUTTUJA JA SIIHEN LUETAAN SYÖTE
		// 	RIVI LUETAAN OIKEALTA VASEMMALLE KUN =
		String nimi = lukija.nextLine();
		// JAVA KIELESSÄ MUUTTUJIEN VÄLIIN LIITETÄÄN
		// NS KOVAKOODATTUA TEKSTIÄ LAINAUSMERKEISSÄ,
		// KUN VÄLISSÄ ON + MERKKI
		System.out.println("Hei " + nimi + "!");
		
	}
}
