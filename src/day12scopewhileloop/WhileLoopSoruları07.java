package day12scopewhileloop;

import java.util.Scanner;

public class WhileLoopSoruları07 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir rakam alýn ve bu rakam icin çarpým tablosunu ekrana
		 * yazdýrýn. Kullanýcýnýn hata yapmadýðýný farz edin. Ornegin kullanýcý 3
		 * girerse; 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen çarpýmtablosu yapýlacak sayýyý giriniz");
		int num = scan.nextInt();

		int i = 1;

		while (i < 11) {
			System.out.println(num + "X" + i + "=" + num * i + " ");
			i++;
		}

		scan.close();

	}

}
