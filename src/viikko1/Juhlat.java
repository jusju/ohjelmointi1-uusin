package viikko1;

public class Juhlat {

	public static void main(String[] args) {
		
		double pullojenMaara = 4.1;
		// PYÖRISTETÄÄN KAIKKI YLÖSPÄIN
		double alkostaHaettavaPullomaara = Math.ceil(pullojenMaara);
		// (int) KOMENNOLLA VOIDAAN MUUTTAA KOKONAISLUVUKSI
		// (INT) HOMMELIA SANOTAAN PAKOTETUKSI TYYPPIMUUNNOSEKSI
		// ELI ALAN SLANGILLA "KASTAUS"
		System.out.println((int)alkostaHaettavaPullomaara);

	}

}
