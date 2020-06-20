package day15methodcreation;

import java.util.Scanner;

public class MethodCreationSoruları04 {

	public static void main(String[] args) {
		// Kullanýcýya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini
		// ve iki sayý seçmesini söyleyin.
		// Hangi þekli seçerse, o þeklin alanýný ve çevresini ekrana yazdýran programý
		// yazýnýz.
		hesaplama();

	}

	public static void hesaplama() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen paralelkenar ,dikdörtgen veya üçgen giriniz");
		String þekil = scan.next().toLowerCase();

		switch (þekil) {
		case ("parelelkenar"):
			System.out.println("Lütfen taban kenarý giriniz");
			int numa = scan.nextInt();
			System.out.println("Lütfen yan kenarý giriniz");
			int numb = scan.nextInt();
			System.out.println("Lütfen yükseklik giriniz");
			int yük = scan.nextInt();

			System.out.println("Paralel kenarýn alaný :" + numa * yük);
			System.out.println("Paralel kenarýn çevresi :" + 2 * (numa + numb));
			break;
		case ("dikdörtgen"):
			System.out.println("Lütfen 1.kenarý giriniz");
			int num1 = scan.nextInt();
			System.out.println("Lütfen 2.kenarý giriniz");
			int num2 = scan.nextInt();

			System.out.println("Dikdörtgenin alaný :" + num1 * num2);
			System.out.println("Dikdörtgenin çevresi :" + 2 * (num1 + num2));
			break;
		case ("üçgen"):
			System.out.println("Lütfen 1.kenarý giriniz");
			int num3 = scan.nextInt();
			System.out.println("Lütfen 2.kenarý giriniz");
			int num4 = scan.nextInt();
			System.out.println("Lütfen 3.kenarý giriniz");
			int num5 = scan.nextInt();

			System.out.println("Üçgenin alaný :" + num3 * num4 / 2);
			System.out.println("Üçgenin çevresi :" + (num3 + num4 + num5));
			break;
		default:
			System.out.println("Lütfen uygun þekli giriniz");
		}
		scan.close();
	}

}
