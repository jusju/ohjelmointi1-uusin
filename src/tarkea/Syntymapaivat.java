package tarkea;

import java.time.Duration;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Syntymapaivat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Anna henkilön syntymäpäivä (esim. 30.10.1981): ");
		String synttarit = input.nextLine();
		String[] solut = synttarit.split("\\.");
		int paivat = Integer.parseInt(solut[0]);
		int kuukaudet = Integer.parseInt(solut[1]);
		int vuodet = Integer.parseInt(solut[2]);
		LocalDate synttariPaivamaara = LocalDate.of(vuodet, kuukaudet, paivat);
		LocalDate paivaNyt = LocalDate.now();
		long paiviaValissa = 0;
		if (paivaNyt.getMonthValue() == kuukaudet) {
			if (paivaNyt.getDayOfMonth() > paivat) {
				synttariPaivamaara = LocalDate.of(2022, kuukaudet, paivat);
				paiviaValissa = Duration.between(paivaNyt.atStartOfDay(), synttariPaivamaara.atStartOfDay()).toDays();
				System.out.println("Syntymäpäiviin on " + paiviaValissa + " päivää.");
			} else if (paivaNyt.getDayOfMonth() == paivat) {
				System.out.println("Tänään on syntymäpäiväsi!");
			} else {
				synttariPaivamaara = LocalDate.of(2021, kuukaudet, paivat);
				paiviaValissa = Duration.between(paivaNyt.atStartOfDay(), synttariPaivamaara.atStartOfDay()).toDays();
				System.out.println("Syntymäpäiviin on " + paiviaValissa + " päivää.");
			}
		} else if(paivaNyt.getMonthValue() < kuukaudet) {
			synttariPaivamaara = LocalDate.of(2021, kuukaudet, paivat);
			paiviaValissa = Duration.between(paivaNyt.atStartOfDay(), synttariPaivamaara.atStartOfDay()).toDays();
			System.out.println("Syntymäpäiviin on " + paiviaValissa + " päivää.");
		} else {
			synttariPaivamaara = LocalDate.of(2022, kuukaudet, paivat);
			paiviaValissa = Duration.between(paivaNyt.atStartOfDay(), synttariPaivamaara.atStartOfDay()).toDays();
			System.out.println("Syntymäpäiviin on " + paiviaValissa + " päivää.");
		}
	}

}
