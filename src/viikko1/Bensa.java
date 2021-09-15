package viikko1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bensa {

	public static void main(String[] args) {
		// ENSINN� EKALLA RIVILL� T�LL� KURSSILLA YLEENS�
		// AINA LUODAAN SCANNER, KOLME KIRJAINTA JA CTRL+SPACE
		Scanner input = new Scanner(System.in);
		
		// SYSTEM.OUT.PRINTLN KOMENNON PIKAISEEN
		// TULOSTAMISEEN ON KIKKA: ELI KIRJOITA
		// SYSO JA PAINA CTRL + SPACE
		System.out.print("Anna tankattu m��r�: ");
		double tankattu = input.nextDouble();
		System.out.print("Anna ajetut kilometrit: ");
		// KUTEN �SKENKIN, SCANNERIN AVULLA ON SAATU
		// LUOTUA MUUTTUJA INPUT, JOLLA ON NOIN NELJA
		// KOMENTOA, JOILLA VOIDAAN LUKEA SYOTETTA
		double ajetutKilometrit = input.nextDouble();
		System.out.print("Anna litrahinta: ");
		// SEURAAVASSA CAMEL CASING - ELI EI MUUTTUJAN
		// NIMEEN V�LILY�NTEJ�
		double bensanLitraHinta = input.nextDouble();
		double kilometrinHinta = 
				 tankattu / ajetutKilometrit * bensanLitraHinta;
	
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		System.out.print("Ajo per kilometri maksaa " + desimaalit.format(kilometrinHinta));

		// Anna tankattu m��r�: 10,0
		// Anna ajetut kilometrit: 200
		// Anna litrahinta: 1,43
		// Ajo per kilometri maksaa 0,07
	}

}
