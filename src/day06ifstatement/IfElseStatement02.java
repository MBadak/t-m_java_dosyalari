package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		// Kullanicidan bir tamsayi isteyin ve o tamsayinin
		// mutlak degerini ekrana yazdirin
		// mutlak deger bir sayinin kendi isareti ile carpilmasi demektir
		// Ornek: -3 un mutlak degeri: -1.-3 = 3
		// Ornek: +5 in mutlak degeri: +1.+5 = 5

		Scanner sc = new Scanner(System.in);
		System.out.println("lütfen bir tam sayý giriniz");
		int num1 = sc.nextInt();

		if (num1 < 0) {
			System.out.println(num1 * (-1));
		} else {
			System.out.println(num1 * (1));
		}

		sc.close();

	}

}
