package day12scopewhileloop;

import java.util.Scanner;

public class WhileLoopSoruları03 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden veya
		 * sonrasýndan baþlayýp bitiþ deðerinde veya öncesinde biten tüm çift
		 * tamsayýlarý while loop kullanarak ekrana yazdýrýnýz.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen baþlangýç deðeri giriniz");
		int anf = scan.nextInt();

		System.out.println("Lütfen bitiþ deðeri giriniz");
		int end = scan.nextInt();

		System.out.println("baþlangýç :" + anf);
		System.out.println("bitiþ :" + end);

		while (anf < end + 1) {
			if (anf % 2 == 0) {
				System.out.print(anf + " ");

			}
			anf++;
		}

		scan.close();
	}

}
