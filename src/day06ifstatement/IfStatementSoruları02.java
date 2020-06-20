package day06ifstatement;

import java.util.Scanner;

public class IfStatementSoruları02 {

	public static void main(String[] args) {

		// 2) Kullanýcýdan bir harf alýn
		// eðer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdýrýn.
		// “b, c, d, e” den biri ise ekrana “Sessiz harf” yazdýrýn

		Scanner alfabe = new Scanner(System.in);
		System.out.println("Lütfen bir harf giriniz");

		String harf = alfabe.nextLine();

		if (harf.equals("a") || harf.equals("e") || harf.equals("i") || harf.equals("o")) {
			System.out.println((harf) + " : " + "sesli harf");

		} else if (harf.equals("b") || harf.equals("c") || harf.equals("d") || harf.equals("f")) {
			System.out.println((harf) + " : " + "sessiz harf");

		} else {
			System.out.println((harf) + " : " + "sistemde bu harf yok");
		}
		alfabe.close();
	}

}
