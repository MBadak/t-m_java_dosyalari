package day15methodcreation;

import java.util.Scanner;

public class MethodCreationSoruları03 {

	public static void main(String[] args) {
		// Kullanýcýya sayý girmesini söyleyin.
		// Kullanýcýnýn girdiði sayýnýn rakamlarý toplamýný
		// ekrana yazdýran bir program yazýn.

		Scanner scan = new Scanner(System.in);
		System.out.println("En az iki basamaklý bir sayý giriniz");
		int num = scan.nextInt();

		int sum = 0;
		toplama(sum, num);
		scan.close();
	}

	public static void toplama(int sum, int num) {
		do {
			sum = sum + (num % 10);
			num = num / 10;

		} while (num > 0);
		System.out.println("Rakamlar Toplamý: " + sum);

	}
}
