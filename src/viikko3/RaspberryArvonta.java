package viikko3;

import java.util.Random;

public class RaspberryArvonta {

	public static void main(String[] args) {
		String nimi1 = "Niina";
		String nimi2 = "Niko";
		String nimi3 = "Janina";
		String nimi4 = "Emil";
		String nimi5 = "Sebastian";
		String nimi6 = "Tuukka";
		String nimi7 = "Yasin";
		String nimi8 = "Henry";
		String nimi9 = "Lin";
		String nimi10 = "Kristiina";
		String nimi11 = "Riku";

		// SATUNNAISLUVUN ARVONTA TEHDÄÄN HELPOITEN RANDOMIN KAUTTA
		// ELI LUODAAN RANDOM
		Random satunnainen = new Random();
		int arvonanTulos = satunnainen.nextInt(10) + 1;
		System.out.println("Rasbperryn saa nimi numero " + arvonanTulos);
	}
}
