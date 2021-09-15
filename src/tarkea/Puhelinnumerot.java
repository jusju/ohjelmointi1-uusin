package tarkea;

import java.util.Scanner;

public class Puhelinnumerot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna puhelinnumero: ");
		String puhelinnumero = input.nextLine();
		String numeronAlku = puhelinnumero.substring(0,3);
		String numeronLoppu = puhelinnumero.substring(3);

		String korjattuNumero = "";
		if(numeronAlku.equals("040")) {
			korjattuNumero = "+35840" + numeronLoppu;
			System.out.println("Numero korjattuna on: ");
			System.out.println(korjattuNumero);
		} else if(numeronAlku.equals("050")) {
			korjattuNumero = "+35850" + numeronLoppu;
			System.out.println("Numero korjattuna on: ");
			System.out.println(korjattuNumero);			
		} else {
			System.out.println("Numerossa ei löytynyt korjattavaa.");
		}
	}
}
