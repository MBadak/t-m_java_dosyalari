package day11stringmethod;

import java.util.Scanner;

public class ForLoopSoruları02 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn
		// ve baþlangýç deðerinden veya sonrasýndan baþlayýp bitiþ deðerinde
		// veya öncesinde biten tüm çift tamsayýlarý ekrana yazdýrýn.

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen baþlangýç deðeri giriniz");
		int baþlangýç = scan.nextInt();

		System.out.println("Lütfen bitiþ deðeri giriniz");
		int bitiþ = scan.nextInt();

		System.out.println("Baþlangýç deðeri :" + baþlangýç);
		System.out.println("Bitis deðeri:" + bitiþ);

		if (baþlangýç % 2 == 0) {

			for (int i = baþlangýç; i < bitiþ; i += 2) {
				System.out.print(i + (" "));
			}
		} else {
			for (int i = baþlangýç + 1; i < bitiþ + 1; i += 2) {
				System.out.print(i + (" "));

			}
			scan.close();
		}

	}

}
