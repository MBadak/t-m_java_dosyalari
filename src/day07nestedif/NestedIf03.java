package day07nestedif;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {

		// Kullanicidan yil girmesini isteyin
		// Girilen yil artik yil ise ekrana �Artik Yil� yazdirin
		// Girilen yil artik yil degil
		// art�k y�l subat�n 28 �ekmesidir
		// art�k y�l 1) y�l 100 e b�l�n�rse 400 e de b�l�nmeli
		// 2) y�l 100 2 b�l�nmez ise 4 e b�l�nmeli

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir y�l giriniz");
		int y�l = scan.nextInt();

		if (y�l % 100 == 0) {
			if (y�l % 400 == 0) {
				System.out.println("art�k y�l");
			} else {
				System.out.println("art�k y�l de�il");
			}
		} else if (y�l % 100 != 0) {
			if (y�l % 4 == 0) {
				System.out.println("art�k y�l");
			} else {
				System.out.println("art�k y�l de�il");
			}
		}

		scan.close();
	}

}
