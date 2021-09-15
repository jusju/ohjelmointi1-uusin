package viikko3;

import java.util.Scanner;

public class Alkuluku {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		int luku = 0;
		System.out.print("Syötä jokin positiivinen kokonaisluku: ");
		luku = lukija.nextInt();
		int kasvavaLuku = 2;
		boolean onAlkuluku = true;
		while (kasvavaLuku < luku) {
			if ((luku % kasvavaLuku) == 0) {
				onAlkuluku = false;
			} else {
			}
			kasvavaLuku++;
		}
		if (onAlkuluku) {
			System.out.println("Luku " + luku + " on alkuluku.");
		} else {
			System.out.println("Luku " + luku + " ei ole alkuluku.");
		}
	}
}
