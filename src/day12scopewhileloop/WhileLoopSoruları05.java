package day12scopewhileloop;

import java.util.Scanner;

public class WhileLoopSoruları05 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden
		 * baþlayýp bitiþ deðerinde biten tüm tamsayýlarýn çarpýmýný ekrana yazdýrýn.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen baþlangýç deðeri giriniz");
		int anf = scan.nextInt();

		System.out.println("Lütfen bitiþ deðeri giriniz");
		int end = scan.nextInt();

		System.out.println("baþlangýç :" + anf);
		System.out.println("bitiþ :" + end);

		int çar = 1;

		while (anf < end + 1) {
			çar = çar * anf;
			anf++;

		}
		System.out.println("Çarpýmlarý :" + çar);
		scan.close();
	}

}
