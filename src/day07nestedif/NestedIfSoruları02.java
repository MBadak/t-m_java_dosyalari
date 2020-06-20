package day07nestedif;

import java.util.Scanner;

public class NestedIfSoruları02 {

	public static void main(String[] args) {

//		Kullanýcýdan bir harf girmesini isteyin.
//		Girdiði küçük harf ise harfin “a” olup olmadýðýný kontrol edin. 
//		Harf “a” ise ekrana “Ilk küçük harf” yazdýrýn. 
//		“a” deðil ise ekrana “Ilk küçük harf deðil” yazdýrýn.
//		Girdiði büyük harf ise harfin “Z” olup olmadýðýný kontrol edin.
//		Harf “Z” ise ekrana “Son büyük harf” yazdýrýn. 
//		“Z” deðil ise ekrana “Son büyük harf deðil” yazdýrýn.	

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen bir harf girin");
		char harf = scan.next().charAt(0);

		if (harf > 96 && harf < 123) {
			if (harf == 'a') {
				System.out.println(harf + " :ilk küçük harf");
			} else {
				System.out.println(harf + " :ilk küçük harf deðil");
			}
		}

		if (harf > 64 && harf < 91) {
			if (harf == 'Z') {
				System.out.println(harf + " :Son büyük harf");
			} else {
				System.out.println(harf + " :Son büyük harf deðil");
			}

		}

		scan.close();

	}

}
