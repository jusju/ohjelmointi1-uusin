package viikko1;

import java.util.Scanner;

public class HeiEtunimi {

	public static void main(String[] args) {
		// SKANNERIN LUONTI JA CTRL S MUISTISAANTO ON
		// ETTA KOLME KIRJAINTA JA CTRL + SPACE
		Scanner lukija = new Scanner(System.in);
		// N�YT�LLE TULOSTUS ELI K�YTT�J�LT� KYSYT��N
		System.out.print("Sy�t� etunimi: ");
		// STRING-MUUTTUJA JA SIIHEN LUETAAN SY�TE
		// 	RIVI LUETAAN OIKEALTA VASEMMALLE KUN =
		String nimi = lukija.nextLine();
		// JAVA KIELESS� MUUTTUJIEN V�LIIN LIITET��N
		// NS KOVAKOODATTUA TEKSTI� LAINAUSMERKEISS�,
		// KUN V�LISS� ON + MERKKI
		System.out.println("Hei " + nimi + "!");
		
	}
}
