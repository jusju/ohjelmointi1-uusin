package viikko3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JukanMakihyppy {

	public static void main(String[] args) {
		int tuomareita = 5;
		double tyylipiste, yhteensa = 0, pienin = 20, suurin = 0;
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < tuomareita; i++) {
			System.out.print("Anna tuomarin " + (i + 1) + ". pisteet: ");
			tyylipiste = input.nextDouble();
			if (tyylipiste > suurin) {
				suurin = tyylipiste;
			}
			if (tyylipiste < pienin) {
				pienin = tyylipiste;
			}
			yhteensa = yhteensa + tyylipiste;
		}
		yhteensa = yhteensa - suurin - pienin;
		DecimalFormat desi = new DecimalFormat("0.0");
		System.out.println("Tyylipisteet ovat " + desi.format(yhteensa));
	}

}
