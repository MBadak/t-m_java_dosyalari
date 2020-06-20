package day11stringmethod;

import java.util.Scanner;

public class ForLoopSoruları05 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn 
		// ve baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten
		// tüm tamsayýlarýn çarpýmýný ekrana yazdýrýn.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir baþlangýç deðeri girimiz");
		int baþlangýç = scan.nextInt();

		System.out.println("Lütfen bitiþ deðerini giriniz");
		int bitiþ = scan.nextInt();

		System.out.println("baþlangýç deðeri :" + baþlangýç);
		System.out.println("bitiþ deðeri  :" + bitiþ);
		
		int çar=1;
		
		
		for (int i=baþlangýç ; i<bitiþ ; i++ ) {
			çar=çar*i;
			
		}
		System.out.println("çarpýmþarý :" +çar);
		
		
		
		scan.close();
		
		
	}

}
