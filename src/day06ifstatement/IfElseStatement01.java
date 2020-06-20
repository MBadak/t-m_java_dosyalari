package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		// Kullanicidan password girmesini isteyin
		// password dogru ise ekrana "Password dogru" yazdirin
		// password yanlis ise ekrana "Password yanlis tekrar deneyin" yazdirin
		// Dogru password = Java2020

		Scanner sc = new Scanner(System.in);
		System.out.println("lütfen pasword giriniz");
		String password = sc.nextLine();
		String pas = "Java2020"; // bunu kullanýnca hat verdi
									// direk deperi yazarsak doru verir
									// Stringlerin eþitlikleri için == deðil .equals metodu kullanýlýr.

		// String'lerin esitligini kontrol ederken
		// asla "==" sembolu kullanmayin. Onun yerine
		// "equals()" kullanin

		// "==" String'in degerini ve adresini kontrol eder
		// "equals()" ise sadece degerleri kontrol eder.

		if (password.equals(pas)) {
			System.out.println("password doðru");

		} else {
			System.out.println("Password yanlýþ");
		}
		sc.close();
	}

}
