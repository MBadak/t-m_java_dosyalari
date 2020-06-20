package day14dowhileloop;

import java.util.Scanner;

public class DoWhileSoruları4 {

	public static void main(String[] args) {
		// Kullanýcýya iki sayý girmesini söyleyin.
		// Bu sayýlar eþit ise ekrana “Kare oluþturdunuz” yazdýrýn.
		// Eþit deðilse tekrar iki sayý girmesini söyleyin.
		System.out.println("Lütfen iki sayý giriniz");
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		do {
			System.out.println("Birinci deðer :");
			num1 = scan.nextInt();
			System.out.println("Ýkinci deðer :");
			num2 = scan.nextInt();
			if (num1==num2) {
				System.out.println("kare oluþturdunuz");
			}else {
				System.out.println("Lütfen tekrar iki sayý giriniz");
			}
		} while (num1 != num2);
		scan.close();
	}

}
