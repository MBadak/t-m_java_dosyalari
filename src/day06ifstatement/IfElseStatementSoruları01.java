package day06ifstatement;

import java.util.Scanner;

public class IfElseStatementSoruları01 {

	public static void main(String[] args) {
		// 1) Kullanýcýdan bir tamsayý alýn
		// eðer tamsayý 10 dan kucuk ve 0’dan büyük eþit ise ekrana “Rakam” yazdýrýn.
		// Diðer durumlarda ekrana “Sayý” yazdýrýn

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir tam sayý yazýn");
		int num1 = scan.nextInt();

		if (num1 >= 0 && num1 < 10) {
			System.out.println(num1 + " : Bir Rakamdýr");
		} else {
			System.out.println(num1 + " : Bir Sayýdýr");
		}

		scan.close();

	}

}
