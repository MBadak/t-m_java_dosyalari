package day11stringmethod;

import java.util.Scanner;

public class ForLoopSoruları04 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve 
		// baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten 
		// tüm tamsayýlarýn toplamýný ekrana yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir baþlangýç deðeri girimiz");
		int baþlangýç = scan.nextInt();

		System.out.println("Lütfen bitiþ deðerini giriniz");
		int bitiþ = scan.nextInt();

		System.out.println("baþlangýç deðeri :" + baþlangýç);
		System.out.println("bitiþ deðeri  :" + bitiþ);
		
		int sum=0;
		
		for (int i=baþlangýç ; i<bitiþ+1 ; i++      ) {
			sum=sum +i;
		}
		System.out.println("Toplam =" +sum);
		scan.close();
	}

}
