package day07nestedif;

import java.util.Scanner;

public class NestedIfSoruları03 {

	public static void main(String[] args) {

//		Kullanýcýdan password girmesini isteyin.  
//		Girdiði password 5’e bölünüyorsa son rakamýný kontrol edin.
//		Son rakamý 0 ise ekrana “5’e bölünen çift sayý” yazdýrýn.
//		Son rakamý 0 deðil ise “5’e bölünen tek sayý” yazdýrýn. 
//		Girdiði password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdýrýn.	

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen password giriniz");
		int pas = scan.nextInt();

		if ((pas % 5) == 0) {
			if ((pas & 10) == 0) {
				System.out.println("5’e bölünen çift sayý");
			} else {
				System.out.println("“5’e bölünen tek sayý”");
			}
		} else {
			System.out.println("Tekrar deneyiniz");

		}
		scan.close();
	}

}
