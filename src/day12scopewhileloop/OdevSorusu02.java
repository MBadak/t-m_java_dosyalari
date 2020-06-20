package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn
		// ve baþlangýç deðerinden veya sonrasýndan baþlayýp
		// bitiþ deðerinde veya öncesinde biten
		// tüm 3 ile bölünebilen tamsayýlarý ekrana yazdýrýn.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir baþlangýç deðeri girimiz");
		int baþlangýç = scan.nextInt();

		System.out.println("Lütfen bitiþ deðerini giriniz");
		int bitiþ = scan.nextInt();

		System.out.println("baþlangýç deðeri :" + baþlangýç);
		System.out.println("bitiþ deðeri  :" + bitiþ);

		if (baþlangýç >= bitiþ) {
			System.out.println("baþlanðýç deðeri küçük olmalý");
		} else {
			for (int i = baþlangýç; i < bitiþ; i++) {
				if (i % 3 == 0) {
					System.out.print(i+" ");
				}
					
				
			}
			scan.close();

		}
	}

}
