package zadanie;

import java.util.Random;
import java.util.Scanner;

public class kwadrat {

	public static void main(String args[]) {
		

		Random r = new Random();
		
		Scanner s = new Scanner(System.in);

		System.out.println("Podaj dlugosc boku kwadratu");
		int n = s.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n-1 ) {
					System.out.print("*");
				}
				else if(j==0 || j==n-1) 
				{
					System.out.print("*");
				}
				else 
				{	
				System.out.print(" ");
			}
			}
			
			System.out.println();
		}
		
		
	 }
	 }
		
	
