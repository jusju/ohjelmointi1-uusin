package viikko3;

import java.util.Scanner;

public class Katsastus {

	public static void main(String[] args) {
		int KATSASTUSHINTA = 50;
		int JALKITARKASTUSHINTA = 30;
		int bensa = 22;
		int diisel = 31;
		int hinta = 0;
		Scanner lukija = new Scanner(System.in);
		System.out.println("Onko 1=katsastus, 2=jälkitarkastus:");
		int katsastusVaiJalkitarkastus = lukija.nextInt();
		if (katsastusVaiJalkitarkastus == 1) {
			hinta = KATSASTUSHINTA;
			System.out.println("Mitataanko päästöt 0=ei, 1=kyllä:");
			int paasto = lukija.nextInt();
			if (paasto == 1) {
				System.out.println("Onko auto 0=bensa, 1=diesel:");
				int bensaVaiDiesel = lukija.nextInt();
				if (bensaVaiDiesel == 1) {
					hinta = hinta + diisel;
				} else {
					hinta = hinta + bensa;
				}
			}
		} else {
			hinta = JALKITARKASTUSHINTA;
		}
		System.out.println("Hinta on " + hinta);

	}
}
