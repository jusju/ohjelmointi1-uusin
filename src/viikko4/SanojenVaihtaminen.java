package viikko4;

import java.util.Iterator;
import java.util.Scanner;

public class SanojenVaihtaminen {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Kirjoita lause: ");
		String lause = lukija.nextLine();
		// MERKKIJONON PILKKIMINEN TAULUKKOON, EROTTIMENA SPACE
		String[] sanat = lause.split(" ");
		System.out.println("Mitkä sanat vaihdetaan keskenään?");
		int sana1 = lukija.nextInt();
		int sana2 = lukija.nextInt();
		String temppi = sanat[sana1];
		// SANAN2 SELÄNPÄÄ ENTER
		lukija.nextLine();
		for (int i = 0; i < sanat.length; i++) {
			if(i == sana1) {
				sanat[i] = sanat[sana2];
			}
			if(i == sana2) {
				sanat[i] = temppi;
			}
		}
		for (int i = 0; i < sanat.length; i++) {
			System.out.print(sanat[i] + " ");
		}
	}
}
