package day03operators;

import java.util.Scanner;

public class Soru9ve10 {

	public static void main(String[] args) {
		// 9)Kullan�c�dan ad ve soyad�n� al�p ekrana yazd�ran bir program yaz�n�z.
		// (String kullan�n�z)

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen isim soyisim giriniz.");
		System.out.print("isim soyisim =");
		String isim = scan.nextLine();
		System.out.println(isim);

		/*
		 * 10)Kullan�c�dan ad, soyad ve adresini al�p ekrana yazd�ran bir program
		 * yaz�n�z. Ad ve soyad ilk sat�rda, adres ikinci sat�rda olsun. (String
		 * kullan�n�z
		 */

		System.out.println("L�tfen Ad ve Soyad� giriniz.");
		System.out.print("Ad� Soyad� =");
		String ad = scan.nextLine();

		System.out.println("L�tfen Adres giriniz.");
		System.out.print("Adres =");
		String adres = scan.nextLine();

		System.out.println(ad);
		System.out.println(adres);
		scan.close();

	}

}
