package day10Stringmethods;

import java.util.Scanner;

public class StringMethodSoruları04 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan yaþadýðý ülkenin ismini alýn bu ülkenin ismi Amerika ise ekrana
		 * USA, Ingiltere ise ekrana UK, Almanya ise ekrana DE yazdýrýn. Diðer ülkeler
		 * için ise NA yazdýrýn.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen yaþadýðýnýz ülkeyi giriniz");
		String ülke = scan.nextLine().toLowerCase();

		switch (ülke) {

		case "amerika":
			System.out.println("USA");
			break;
		case "ingiltere":
			System.out.println("UK");
			break;
		case "almanya":
			System.out.println("DE");
			break;
		default:
			System.out.println("NA");

			scan.close();
		}

	}

}
