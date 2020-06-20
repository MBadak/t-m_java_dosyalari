package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {

		// kullanýcýdan integer aldýktan sonra String alamýyoruz.

		Scanner scan = new Scanner(System.in);
		System.out.println("yaþýnýzý giriniz");
		// int yaþ=scan.nextInt(); // bunu Strin yaptýk altta

		String yaþ = scan.nextLine();
		int yeniyaþ = Integer.parseInt(yaþ);

		System.out.println(yeniyaþ);

		System.out.println("Adýnýzý soyadýnýzý giriniz");
		String isim = scan.nextLine();
		System.out.println(isim);

		scan.close();

	}

}
