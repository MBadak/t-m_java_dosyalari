package day06ifstatement;

import java.util.Scanner;

public class IfStatementSoruları04 {

	public static void main(String[] args) {

//	4)  Kullanýcýdan iki sayý alýn 
//		eðer sayýlarýn iþaretleri  ayný ise ekrana “Ayný iþaretli” yazdýrýn.
//		Sayýlarýn iþaretleri  farklý ise ekrana “Farklý iþaretli” yazdýrýn.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iki adet sayý giriniz");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		if (num1 == 0 || num2 == 0) {
			System.out.println("0 sayýsýnýn iþareti yoktur.");
		} else if ((num1 < 0 && num2 < 0) || (num1 > 0 && num2 > 0)) {
			System.out.println("sayýlar ayný iþaretli..");
		} else {
			System.out.println("sayýlar farklý iþaretli.");
		}

		scan.close();
	}

}
