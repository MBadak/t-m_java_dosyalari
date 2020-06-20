package day15methodcreation;

import java.util.Scanner;

public class MethodCreationSoruları01 {

	public static void main(String[] args) {

		// Kullanıcıdan isim ve soyismini alın. Kullanıcının isim ve
		// soyisminin ilk harflerini büyük
		// diğer harflerini küçük harf olarak ekrana yazdıran programı yazınız.

		Scanner scan = new Scanner(System.in);
		System.out.println("Adinizi giriniz");
		String ad = scan.nextLine().toLowerCase();
		System.out.println("ikinci Adinizi giriniz");
		String ad2 = scan.nextLine().toLowerCase();
		System.out.println("Soyadinizi giriniz");
		String soyAd = scan.nextLine().toLowerCase();

		bilgi(ad, soyAd, ad2);
		scan.close();

	}

	public static void bilgi(String ad, String soyAd, String ad2) {

		ad = ad.toUpperCase().charAt(0) + ad.substring(1);
		ad2 = ad2.toUpperCase().charAt(0) + ad2.substring(1);
		soyAd = soyAd.toUpperCase().charAt(0) + soyAd.substring(1);
		System.out.println(ad + " " + ad2 + " " + soyAd);
	}

}
