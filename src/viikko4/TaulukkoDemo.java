package viikko4;

public class TaulukkoDemo {

	public static void main(String[] args) {
		// 1. TAULUKON LUONTI
		String[] nimet = new String[7];
		// 2. ARVOJEN TALLENNUS TAULUKKOON
		nimet[0] = "Jukka";
		nimet[1] = "Sebastian";
		nimet[2] = "Jarmo";
		nimet[3] = "Tiina";
		nimet[4] = "Okko";
		nimet[5] = "Riina";
		nimet[6] = "Ilona";
		// 3. TAULUKON TULOSTAMINEN
		for (int i = 0; i < nimet.length; i++) {
			System.out.println(nimet[i]);
		}
	}
}
