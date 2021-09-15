package viikko3;

import java.util.Random;
import java.util.Scanner;

public class JukanKertolasku {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int luku1, luku2, tulo, vastaus;
		boolean oikein = false;

		luku1 = (int) (Math.random() * 9) + 1;
		luku2 = (int) (Math.random() * 9) + 1;
		// SAMAN ASIAN VOI TEHDÄ NÄIN - ARVOO NUMERON VÄLILTÄ 1 - 9
		Random satunnainen = new Random();
		int luku3 = satunnainen.nextInt(9) +1 ;
		
		tulo = luku1 * luku2;
		do {
			System.out.print(luku1 + " * " + luku2 + " = ");
			vastaus = input.nextInt();
			if (vastaus == tulo) {
				System.out.println("Oikein");
				oikein = true;
			} else {
				System.out.println("Väärin");
			}
		} while (oikein == false);
	}
}