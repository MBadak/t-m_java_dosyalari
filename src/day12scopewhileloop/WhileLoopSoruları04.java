package day12scopewhileloop;

import java.util.Scanner;

public class WhileLoopSoruları04 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn baþlangýç deðerinden
		 * baþlayýp bitiþ deðerinde biten tüm tamsayýlarýn toplamýný ekrana yazdýrýn
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen baþlangýç deðeri giriniz");
		int anf = scan.nextInt();

		System.out.println("Lütfen bitiþ deðeri giriniz");
		int end = scan.nextInt();

		System.out.println("baþlangýç :" + anf);
		System.out.println("bitiþ :" + end);

		int sum = 5;

		while (anf < end + 1) {
			sum = sum + anf;
			anf++;

		}
		
		System.out.println("toplam :" + sum);

		scan.close();

	}

}
