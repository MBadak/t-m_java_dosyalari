package day06ifstatement;

import java.util.Scanner;

public class IfElseStatementSoruları02 {

	public static void main(String[] args) {
		// 2) Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn
		// eðer;
		// üç kenar uzunluðu birbirine eþit ise ekrana “Eþkenar üçgen” yazdýrýn.
		// Diðer durumlarda ekrana “Eþkenar deðil” yazdýrýn

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen üçgenin 1. kenar uzunluðunu girin");
		double num1 = scan.nextDouble();
		System.out.println("Lütfen üçgenin 2. kenar uzunluðunu girin");
		double num2 = scan.nextDouble();
		System.out.println("Lütfen üçgenin 3. kenar uzunluðunu girin");
		double num3 = scan.nextDouble();

		if (num1 == num2 && num2 == num3) {
			System.out.println("Bu üçgen eþkenar bir üçgendir");
		} else {
			System.out.println("Bu üçgen eþkenar deðil");
		}

		// 0 bir uzunluk deðil ,
		// negatif sayý uzunluk deðil,
		// bir kenar uzunlugu iki kenarýn toplamýnda uzun olursa bu üçgen olmaz.

		scan.close();
	}

}
