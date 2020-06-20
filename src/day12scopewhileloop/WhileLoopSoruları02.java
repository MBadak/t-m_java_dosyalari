package day12scopewhileloop;

import java.util.Scanner;

public class WhileLoopSoruları02 {

	public static void main(String[] args) {
		/* Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn 
		baþlangýç deðerinden baþlayýp bitiþ deðerinde 
		biten tüm tamsayýlarý 
		while loop kullanarak ekrana yazdýrýnýz. */
		
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Lütfen baþlangýc deðeri giriniz");
		int anf=scan.nextInt();
		
		System.out.println("Lütfen bitiþ deðeri giriniz");
		int end=scan.nextInt();
		
		System.out.println("baþlangýç :" + anf);
		System.out.println("bitiþ :" + end);
		
		while (anf<end+1) {
			System.out.print(anf +" ");
			anf++;
		}
		
		
		scan.close();
	}

}
