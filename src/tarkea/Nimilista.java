package tarkea;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Nimilista {

	public static void main(String[] args) {
		System.out.println("Ohjelmassa pidet‰‰n listaa kavereista.");
		Scanner input = new Scanner(System.in);
		List<String> kaverit = new ArrayList<String>();
		int valinta = 1;
		while(valinta != 4) {
			System.out.println("(1) Lis‰‰ kaveri");
			System.out.println("(2) Poista kaveri");
			System.out.println("(3) Listaa kaverit");
			System.out.println("(4) Lopeta ohjelma");
			System.out.print("Anna toiminto (1, 2, 3 tai 4):");
			valinta = input.nextInt();
			input.nextLine();
			if(valinta == 1) {
				System.out.print("Anna kaverin nimi: ");
				String nimi = input.nextLine();
				kaverit.add(nimi);
			} else if(valinta == 2) {
				System.out.print("Anna poistettavan kaverin indeksi: ");
				int indeksi = input.nextInt();
				kaverit.remove(indeksi);
			} else if(valinta == 3) {
				for (int i = 0; i < kaverit.size(); i++) {
					System.out.println(i + " " + kaverit.get(i));
				}
			}
		}
		
	}

}
