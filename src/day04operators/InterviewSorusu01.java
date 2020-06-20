package day04operators;

import java.util.Scanner;

public class InterviewSorusu01 {

	public static void main(String[] args) {

		// iki veriable degerlerinin de�i�tiriniz.
		// say1=12 , say2=30 ==> say1=30 , say2=12 olsun (bu i�leme swap denir)

		Scanner scan = new Scanner(System.in);

		System.out.println("yerlerini de�i�tirmek i�in iki say� giriniz");
		double say1 = scan.nextDouble();
		double say2 = scan.nextDouble();

		// 1.yol : bir kapdaha a�ar bir de�eri ona b�rak�r diger de�eri bo�alana konur
		// vs...
		System.out.println("de�i�imden �nce:");
		System.out.println(say1);
		System.out.println(say2);

		double gecici = 0.0; // Gecici birkap olu�turduk
		gecici = say1; // say1 i geciciye koyduk,
		say1 = say2; // say1 e say2 i koyduk ,
		say2 = gecici; // say2 e gecicidekini koyduk yerde�i�mi� olduk

		System.out.println("de�i�imden sonra:");
		System.out.println(say1);
		System.out.println(say2);

		// 2.yol kap kullanmadan

		System.out.println("yerlerini de�i�tirmek i�in tekrar iki say� giriniz");
		double say4 = scan.nextDouble();
		double say5 = scan.nextDouble();

		say4 = say4 + say5;
		say5 = say4 - say5;
		say4 = say4 - say5;

		System.out.println(say4);
		System.out.println(say5);
		scan.close();
	}

}
