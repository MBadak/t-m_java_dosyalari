package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan dikdörtgenin boyutlarýný alan ve sonra diktörtgenin alan ve
		 * cevresini hesaplayýp ekrana yazdýran bir program yazýnýz. Not: Alan: Boy x En
		 * Not: Çevre: 2x (Boy + En)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen en giriniz");
		int en = scan.nextInt();
		System.out.println("lütfen boy giriniz");
		int boy = scan.nextInt();
		System.out.print("alan :");
		System.out.println(en * boy);
		System.out.print("çevre uzunluðu:");
		System.out.println(2 * (en + boy));

		scan.close();

	}
}
