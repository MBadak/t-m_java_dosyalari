package day14dowhileloop;

import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {
		/*
		 * kullan�c�dan ismini al�n ilk harf b�y�k harf ise do�ru giri� yapt�n�z
		 * yazd�r�n il harf k���k ise "ilk harfi b�y�k harf olarak giriniz
		 */

		Scanner scan = new Scanner(System.in);
		String isim = "";

		do {
			System.out.println("L�tfen isminizi giriniz");
			isim = scan.nextLine();
			if (isim.charAt(0) >= 'A' && isim.charAt(0) <= 'Z') {
				System.out.println("Do�ru giri� yapt�n�z");

			} else {
				System.out.println("ilk harfi b�y�k harf olarak giriniz");
			}

		} while (!(isim.charAt(0) >= 'A' && isim.charAt(0) <= 'Z'));

		scan.close();

	}

}
