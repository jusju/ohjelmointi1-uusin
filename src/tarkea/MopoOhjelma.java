package tarkea;

import java.util.Scanner;

public class MopoOhjelma {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Kuinka monta vuotta vanha henkil� on: ");
		int ika = input.nextInt();
		if (ika >= 15) {
			System.out.println("Henkil� voi saada mopokortin.");
		} else {
			System.out.println("Ik� ei viel� riit� mopokorttiin.");
		}
	}
}
