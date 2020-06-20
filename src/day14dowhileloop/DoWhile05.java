package day14dowhileloop;

import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {
		/*
		 * kullanýcýdan ismini alýn ilk harf büyük harf ise doðru giriþ yaptýnýz
		 * yazdýrýn il harf küçük ise "ilk harfi büyük harf olarak giriniz
		 */

		Scanner scan = new Scanner(System.in);
		String isim = "";

		do {
			System.out.println("Lütfen isminizi giriniz");
			isim = scan.nextLine();
			if (isim.charAt(0) >= 'A' && isim.charAt(0) <= 'Z') {
				System.out.println("Doðru giriþ yaptýnýz");

			} else {
				System.out.println("ilk harfi büyük harf olarak giriniz");
			}

		} while (!(isim.charAt(0) >= 'A' && isim.charAt(0) <= 'Z'));

		scan.close();

	}

}
