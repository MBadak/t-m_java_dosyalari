package day14dowhileloop;

import java.util.Scanner;

public class DoWhileSoruları6 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir String alýn ve bu String’in icinde “a” harfi varsa ekrana “a
		 * harfi var” yazdýrýn. “a” harfi yoksa tekrar bir String girmesini isteyin.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen bir text giriniz");
		String str = "";

		do {
			str = scan.nextLine();

			if (str.contains("a")) {
				System.out.println("a harfi var");
			} else {
				System.out.println("Lütfen tekrar bir text giriniz");
			}

		} while (!(str.contains("a")));
		scan.close();
	}
}
