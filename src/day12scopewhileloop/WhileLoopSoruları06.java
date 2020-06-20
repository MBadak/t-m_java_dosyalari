package day12scopewhileloop;

import java.util.Scanner;

public class WhileLoopSoruları06 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan baþlangýç ve bitiþ harflerini alýn ve baþlangýç harfinden
		 * baþlayýp bitiþ harfinde biten tüm harfleri büyük harf olarak ekrana yazdýrýn.
		 * Kullanýcýnýn hata yapmadýðýný farz edin.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen baþlangýç harfini giriniz");
		char harf1 = scan.next().toUpperCase().charAt(0);

		System.out.println("Lütfen bitiþ harfini giriniz");
		char harf2 = scan.next().toUpperCase().charAt(0);

		while (harf1 < harf2+1) {
			System.out.print(harf1 + " ");
			harf1++;
		}

		scan.close();
	}

}
