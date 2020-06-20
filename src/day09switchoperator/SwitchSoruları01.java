package day09switchoperator;

import java.util.Scanner;

public class SwitchSoruları01 {

	public static void main(String[] args) {
		
//		Kullanýcýdan bir gun alýn 
//		eðer gun 
//		“Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdýrýn.
//		“Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdýrýn. 
//		“Pazar” ise ekrana  “Hýristiyanlar için kutsal gün” yazdýrýn. 
//		Diler günler icin “Kutsal gün deðil” yazdýrýn.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen bir gün giriniz");
		
		String gün =scan.nextLine().toLowerCase();
		
		switch (gün) {
		case ("cuma "):
			System.out.println("Müslümanlar için kutsal gün");
		break;
		
		case ("cumamartesi"):
			System.out.println("Yahudiler için kutsal gün");
		break;
		
		case ("pazar"):
			System.out.println("Hýristiyanlar için kutsal gün");
		break;
		default :
			System.out.println("Kutsal gün deðil” yazdýrýn.");
		
		}
		
		scan.close();
	}

}
