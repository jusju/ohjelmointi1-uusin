package viikko4;

import java.util.Scanner;

public class PuskuriEntteri {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Anna ik�si: ");
		int ika = lukija.nextInt();
		// LUETAAN SELANPAA ENTER POIS
		lukija.nextLine();
		
		System.out.println("Ik�si on "+ ika);
		System.out.println("Onko Raspberry kivaa?");
		String raspi = lukija.nextLine();
		System.out.println("Vastasit: " + raspi);
	}
}
