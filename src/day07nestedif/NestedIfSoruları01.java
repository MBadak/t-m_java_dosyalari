package day07nestedif;

import java.util.Scanner;

public class NestedIfSoruları01 {

	public static void main(String[] args) {
//		Kullanýcýdan cinsiyetini girmesini isteyin. 
//		Erkek ise yaþýný kontrol edin. 
//		Yaþý 18 den küçük ise ekrana “Erkek çocuk” yazdýrýn.
//		Yaþý 18 den büyük eþit ise ekrana “Adam” yazdýrýn.
//		Kýz  ise yasini kontrol edin. 
//		Yaþý 18 den küçük ise ekrana “Kýz çocuk” yazdýrýn.
//		Yaþý 18 den büyük eþit ise ekrana “Kadýn” yazdýrýn.

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen cinsiyet giriniz");
		String cinsiyet = scan.nextLine();

		if (cinsiyet.equalsIgnoreCase("erkek")) {

			System.out.println("Lütfen yaþ giriniz");
			int yaþ = scan.nextInt();
			if (yaþ < 18) {
				System.out.println("Erkek çocuk");
			} else if (yaþ >= 18) {
				System.out.println("adam");
			}

		}

		if (cinsiyet.contentEquals("kýz")) {
			System.out.println("Lütfen yaþ giriniz");
			int yaþ = scan.nextInt();
			if (yaþ < 18) {
				System.out.println("kýz çocuk");
			} else if (yaþ >= 18) {
				System.out.println("kadýn");
			}

		}

		else {
			System.out.println("Baþka deðer giriniz");
			scan.close();
		}
	}

}
