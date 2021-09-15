package tarkea;

import java.util.Scanner;

public class MopoOhjelma {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Kuinka monta vuotta vanha henkilö on: ");
		int ika = input.nextInt();
		if (ika >= 15) {
			System.out.println("Henkilö voi saada mopokortin.");
		} else {
			System.out.println("Ikä ei vielä riitä mopokorttiin.");
		}
	}
}
