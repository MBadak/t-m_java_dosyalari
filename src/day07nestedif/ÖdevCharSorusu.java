package day07nestedif;

import java.util.Scanner;

public class ÖdevCharSorusu {

	public static void main(String[] args) {
		// Kullanýcýdan bir character alýn eðer character bir harf ise ekrana “Harf”
		// yazdýrýn.
		// Diðer durumlarda ekrana “Harf deðil” yazdýrýn.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir karakter giriniz");
		char harf = scan.next().charAt(0); // kullanýcýdan char almak için kullanýlýr
		// harflerin ýýscký sayý deðerlerini kullanýn
		if ((harf <= 122 && harf >= 97) || harf <= 90 && harf >= 65) {
			System.out.println("bu bir harftir");
		} else {
			System.out.println("bu bir harf deðildir");
		}

		scan.close();

	}

}
