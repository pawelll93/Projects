package zadanie;

import java.util.Scanner;

public class ZadanieZnaki {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Podaj max 30 znak�w. Program wypisze je bez powt�rze� w kolejno��i alfabetycznej");
		String znaki = s.nextLine();
		char t[] = znaki.toCharArray();
		if (t.length > 30) {
			System.out.println("Przekroczono limit znak�w !");
		} else {
			String litery = "aAbBcCdDeEfFgGhHiIjJkKmMLlnNoOpPrRsStTuUwWqQyYzZ��xX";
			char alfabet[] = litery.toCharArray();
			int[] wystapienia = new int[alfabet.length];

			for (int i = 0; i < alfabet.length; i++) {
				for (int j = 0; j < t.length; j++) {

					if (t[j] == alfabet[i]) {
						wystapienia[i]++;
					}

				}
			}
			
			for (int i = 0; i < alfabet.length; i++) {
				if(wystapienia[i]>0) {
					System.out.print(alfabet[i]);
			}
			}
			
		}
	}
}
