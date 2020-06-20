package day07nestedif;

import java.util.Scanner;

public class ArtikYilSorusuInterview {

	public static void main(String[] args) {
		// Kullanicidan yil girmesini isteyin
		// Girilen yil artik yil ise ekrana “Artik Yil” yazdirin
		// Girilen yil artik yil degil
		// artýk yýl subatýn 28 çekmesidir
		// artýk yýl 1) yýl 100 e bölünürse 400 e de bölünmeli
		// 2) yýl 100 2 bölünmez ise 4 e bölünmeli

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir yýl giriniz");
		int yýl = scan.nextInt();

		if (yýl % 100 == 0 && yýl % 400 == 0) {
			System.out.println("artýk yýl");
		} else if (yýl % 100 != 0 && yýl % 4 == 0) {
			System.out.println("artýk yýldýr");
		} else {
			System.out.println("artýk yýl deðildir");
		}

		scan.close();

	}

}
