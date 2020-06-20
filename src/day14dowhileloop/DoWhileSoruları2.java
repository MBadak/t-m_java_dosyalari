package day14dowhileloop;

import java.util.Scanner;

public class DoWhileSoruları2 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn
		//ve baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten
		//4 ve 6 ile bölünebilen tüm tamsayýlarý ekrana yazdýrýnýz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir baþlangýç deðeri giriniz.");
		int anf=scan.nextInt();
		System.out.println("Lütfen bir bitiþ deðeri giriniz");
		int end=scan.nextInt();
		
		System.out.println("baþlangýç :" + anf);
		System.out.println("bitiþ :" + end);
		
		do {
			if (anf%4==0 && anf%6==0 ) {
				System.out.println(anf);
			}anf++;
		}while (anf<end);
		scan.close();
	}

}
