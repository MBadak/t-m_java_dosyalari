package day13whiledowhileloops;

import java.util.Scanner;

public class WhileLoopSoruları02 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden
		 * baþlayýp bitiþ deðerinde biten 3 ve 5 ile bölünebilen tüm tamsayýlarý ekrana
		 * yazdýrýnýz.
		 * hem for loop hem de while loop kullanarak çözünüz.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen baþlangýç deðeri girin");
		int anf = scan.nextInt();

		System.out.println("Lütfen bitiþ deðeri girin");
		int end = scan.nextInt();

		System.out.println("baþlangýç :" + anf);
		System.out.println("bitiþ :" + end);

		for (int i = anf; i < end + 1; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		int i = anf;
		while (i < end + 1) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}

		scan.close();
	}

}
