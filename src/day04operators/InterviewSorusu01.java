package day04operators;

import java.util.Scanner;

public class InterviewSorusu01 {

	public static void main(String[] args) {

		// iki veriable degerlerinin deðiþtiriniz.
		// say1=12 , say2=30 ==> say1=30 , say2=12 olsun (bu iþleme swap denir)

		Scanner scan = new Scanner(System.in);

		System.out.println("yerlerini deðiþtirmek için iki sayý giriniz");
		double say1 = scan.nextDouble();
		double say2 = scan.nextDouble();

		// 1.yol : bir kapdaha açar bir deðeri ona býrakýr diger deðeri boþalana konur
		// vs...
		System.out.println("deðiþimden önce:");
		System.out.println(say1);
		System.out.println(say2);

		double gecici = 0.0; // Gecici birkap oluþturduk
		gecici = say1; // say1 i geciciye koyduk,
		say1 = say2; // say1 e say2 i koyduk ,
		say2 = gecici; // say2 e gecicidekini koyduk yerdeðiþmiþ olduk

		System.out.println("deðiþimden sonra:");
		System.out.println(say1);
		System.out.println(say2);

		// 2.yol kap kullanmadan

		System.out.println("yerlerini deðiþtirmek için tekrar iki sayý giriniz");
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
