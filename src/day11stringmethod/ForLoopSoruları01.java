package day11stringmethod;

import java.util.Scanner;

public class ForLoopSoruları01 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn 
		// baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten tüm tamsayýlarý ekrana yazdýrýn.

		Scanner scan =new Scanner (System.in);
		
		System.out.println("Lütfen bir baþlangýç deðeri giriniz");
		int baþlangýç= scan.nextInt();
		
		System.out.println("Lütfen bir bitiþ deðeri giriniz");
		int bitiþ= scan.nextInt();
		
		for (int i=baþlangýç ; i<bitiþ ; i++ ) {
			System.out.print(i + (" "));
		}
		
		scan.close();
	}

}
