package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		//// Kullanicidan alacagi urun miktarini ve fiyatini alalim
		// Eger kullanici 1000 den fazla urun alirsa %20 indirim yapin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		// Eger kullanici 1000 den az veya 1000 urun alirsa indirim yapmayin
		// ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		// Para konularinda �double� kullanin
		// Ornek: 60TL ye %20 indirim ==> 60*80 /100

		Scanner sc = new Scanner(System.in);

		System.out.println("l�tfen urun miktar�n� giriniz");
		double miktar = sc.nextDouble();

		System.out.println("l�tfen birim fiyat�n� giriniz");
		double fiyat = sc.nextDouble();

		double toplam = fiyat * miktar;

		System.out.print("toplam fiyat :");
		System.out.println(toplam);

		if (miktar > 1000) {
			System.out.print("indirimli fiyat :");
			System.out.println(toplam * 80 / 100);
		} else {
			System.out.println(toplam);
		}
		sc.close();
	}

}
