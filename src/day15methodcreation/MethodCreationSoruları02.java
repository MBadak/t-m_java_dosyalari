package day15methodcreation;

import java.util.Scanner;

public class MethodCreationSoruları02 {

	public static void main(String[] args) {
		// Kullanýcýdan iki sayý alýn bu sayýlar eþit ise ekrana “Eþit”,
		// birinci sayý büyük ise ekrana “Birinci sayý büyük”,
		// ikinci sayý büyük ise ekrana “Ikinci sayý büyük” yazdýrýnýz.

		sayýKarþýleþtýrma();

	}

	public static void sayýKarþýleþtýrma() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen 1. sayýyý giriniz");
		int num1 = scan.nextInt();

		System.out.println("Lütfen 2. sayýyý giriniz");
		int num2 = scan.nextInt();

		if (num1 == num2) {
			System.out.println("Sayýlar eþit");
		}else 
		if (num1 > num2) {
			System.out.println("Birinci sayý büyük");
		} else {
			System.out.println("Ýkinci sayý büyük");
		}
		scan.close();
	}
}
