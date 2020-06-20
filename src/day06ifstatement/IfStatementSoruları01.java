package day06ifstatement;

import java.util.Scanner;

public class IfStatementSoruları01 {

	public static void main(String[] args) {
		// 1) Kullanýcýdan bir tamsayý alýn
		// eðer tamsayý 3 ile bölünebiliyorsa ekrana “3’ün katý” yazdýrýn.
		// 3 ile bölünemiyorsa ekrana “3’ün katý deðildir” yazdýrýn.

		Scanner sc = new Scanner(System.in);
		System.out.println("lütfen bir tam sayý giriniz");
		int num1 = sc.nextInt();

		if (num1 == 0) {
			System.out.println("Girdiðniz sayý 3 'ün katý deðildir.");
		} else if (num1 % 3 == 0) {
			System.out.println("Girdiðniz sayý 3 'ün katýdýr");
		} else {
			System.out.println("Girdiðniz sayý 3 'ün katý deðildir.");
		}

		sc.close();

	}

}
