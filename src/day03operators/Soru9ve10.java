package day03operators;

import java.util.Scanner;

public class Soru9ve10 {

	public static void main(String[] args) {
		// 9)Kullanýcýdan ad ve soyadýný alýp ekrana yazdýran bir program yazýnýz.
		// (String kullanýnýz)

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen isim soyisim giriniz.");
		System.out.print("isim soyisim =");
		String isim = scan.nextLine();
		System.out.println(isim);

		/*
		 * 10)Kullanýcýdan ad, soyad ve adresini alýp ekrana yazdýran bir program
		 * yazýnýz. Ad ve soyad ilk satýrda, adres ikinci satýrda olsun. (String
		 * kullanýnýz
		 */

		System.out.println("Lütfen Ad ve Soyadý giriniz.");
		System.out.print("Adý Soyadý =");
		String ad = scan.nextLine();

		System.out.println("Lütfen Adres giriniz.");
		System.out.print("Adres =");
		String adres = scan.nextLine();

		System.out.println(ad);
		System.out.println(adres);
		scan.close();

	}

}
