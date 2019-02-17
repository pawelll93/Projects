package zadanie;

import java.util.Random;
import java.util.Scanner;

public class totolotek {

	public static void main(String args[]) {

		
		Scanner s = new Scanner(System.in);
		int[] kupon = new int[6];
		int[] wylosowane = new int[6];
		int k = 0;
		while (k < 6) {
			System.out.println("Podaj liczbe od 1-49. Liczby nie moga sie powtarzac");
			int w = s.nextInt();
			boolean poprawna = CzyPoprawna(w, kupon);
			if (poprawna) {
				kupon[k] = w;
				k++;
			} else {
				System.out.println("Nie poprawna liczba");
			}

		}

		Random r = new Random();

		int ile0 = 0;
		int ile1 = 0;
		int ile2 = 0;
		int ile3 = 0;
		int ile4 = 0;
		int ile5 = 0;
		int ile6 = 0;

		for (int i = 0; i < 1; i++) {
			k = 0;
			while (k < 6) {
				int w = r.nextInt(50);
				if (CzyPoprawna(w, wylosowane)) {
					wylosowane[k] = w;
					k++;
				}
			}

			for (int w : kupon) {
				System.out.print(w + ",");
			}

			System.out.println();

			for (int w : wylosowane) {

				System.out.print(w + ",");

			}
			{

				int wspolne = 0;

				for (int z = 0; z < 6; z++)
					for (int x = 0; x < 6; x++) {

						if (kupon[z] == wylosowane[x]) {

							wspolne++;

						}

					}
				System.out.println("Trafiles " + wspolne);
				if (wspolne == 1) {
					ile1++;
				} else if (wspolne == 2) {
					ile2++;
				}

				else if (wspolne == 3) {
					ile3++;
				}

				else if (wspolne == 4) {
					ile4++;
				}

				else if (wspolne == 5) {
					ile5++;
				} else if (wspolne == 6) {
					ile6++;
				}
				else {
					ile0++;
				}

			}

		}

		System.out.println("trafiono 6: "+ ile6);
		System.out.println("trafiono 5: "+ ile5);
		System.out.println("trafiono 4: "+ ile4);
		System.out.println("trafiono 3: "+ ile3);
		System.out.println("trafiono 2: "+ ile2);
		System.out.println("trafiono 1: "+ ile1);
		System.out.println("trafiono 0: "+ ile0);
	}


	public static boolean CzyPoprawna(int w, int[] kupon) {
		if (w < 1 || w > 49) {
			return false;
		}

		for (int c : kupon) {
			if (c == w) {
				return false;
			}
		}

		return true;

	}

}
