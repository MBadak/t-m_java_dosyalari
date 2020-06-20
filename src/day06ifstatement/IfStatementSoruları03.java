package day06ifstatement;

import java.util.Scanner;

public class IfStatementSoruları03 {

	public static void main(String[] args) {
//	3)  Kullanýcýdan bir gun alýn 
//		eðer gun 
//		“Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdýrýn.
//		“Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdýrýn.
//		“Pazar” ise ekrana  “Hýristiyanlar icin kutsal gün” yazdýrýn

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir gün giriniz");
		String gun = scan.nextLine();

		if (gun.equalsIgnoreCase("Cuma")) { // equalsIgnoreCase bu ifade küçük harf büyük harf farketemez
			System.out.println("Müslümanlar icin kutsal gün");
		} else

		if (gun.equalsIgnoreCase("Cumartesi")) {
			System.out.println("Yahudiler icin kutsal gün");
		} else

		if (gun.equalsIgnoreCase("Pazar")) {
			System.out.println("Hýristiyanlar icin kutsal gün");
		} else {
			System.out.println("kutsal gün deðil");
		}
		scan.close();
	}

}
