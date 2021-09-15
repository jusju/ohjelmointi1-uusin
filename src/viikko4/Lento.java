package viikko4;

import java.util.Scanner;

public class Lento {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna lennon numero: ");
		// SYÖTTEEN LUKEMINEN
		String lento = lukija.nextLine();
		
		String lennonEtuliite = lento.substring(0,2);
		System.out.println(lennonEtuliite);
		if(lennonEtuliite.equalsIgnoreCase("AY")) {
			char lennonNumeroString = lento.charAt(2);
			// LENNONNUMEROSTRING PITÄÄ NS. VÄKISIN MUUTTAA STRINGIKSI
			int lennonNumero = Integer.parseInt(lennonNumeroString +"");
			if(lennonNumero == 7) {
				System.out.println("Venäjän lento");
			} else if(lennonNumero >= 2 && lennonNumero <= 6) {
				System.out.println("Kotimaan lento");
			} else {
				System.out.println("Kaukolento");
			} 

		} else {
			System.out.println("Ei ole Finnairin lento");
		}
		
		// "Kaukolento", "Kotimaan lento", "Venäjän lento" tai "Ei ole Finnairin lento".
		
		// Anna lennon numero: AY105
		// Kaukolento
	
		
	}

}
