package day06ifstatement;

import java.util.Scanner;

public class IfElseStatementSoruları03 {

	public static void main(String[] args) {
		// Kullanýcýdan alacaðý ürün miktarýný ve ürünün birim fiyatýný alýn.
		// Eðer;
		// urun miktarý 1000 den fazla ise
		// Kullanýcýya %10 indirim yapýn ve ödemesi gereken toplam parayý ekrana
		// yazdýrýn.
		// Diðer durumlarda ödemesi gereken toplam parayý herhangi bir indirim yapmadan
		// ekrana yazdýrýn.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen ürün miktarýný giriniz");
		int miktar = scan.nextInt();
		System.out.println("Lütfen ürün fiyatýný giriniz");
		double fiyat = scan.nextDouble();

		double top = miktar * fiyat;

		if (miktar < 0 || fiyat < 0) {
			System.out.println("negatif deðer girilemez");
		} else

		if (miktar > 1000) {
			System.out.println(top * 90 / 100);
		} else {
			System.out.println(top);
		}

		scan.close();
	}

}
