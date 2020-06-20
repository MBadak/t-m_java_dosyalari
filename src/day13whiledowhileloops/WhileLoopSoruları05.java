package day13whiledowhileloops;

import java.util.Scanner;

public class WhileLoopSoruları05 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir String alýn ve bu String’in ilk harfi ile son harfinin
		 * yerlerini deðiþtirerek ekrana yazdýrýn. Ornegin; Kullanýcý “Java” girerse
		 * ekrana “aavJ” yazdýracaksýnýz.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String str = scan.nextLine();

		int uz = str.length() - 1;
		int i = 1;

		System.out.print(str.charAt(uz));

		while (i < uz) {
			System.out.print(str.charAt(i));
			i++;
		}
		System.out.print(str.charAt(0));
		scan.close();
	}

}
