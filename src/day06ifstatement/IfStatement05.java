package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		// kulanuc�dan en ve boy al
		// en ve boy e�itse kare desin de�ilse dikd�rtgen desin

		Scanner sc = new Scanner(System.in);
		System.out.println("l�tfen dikd�rgen i�in iki tam say� girin");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if (num1 == num2) {
			System.out.println("bu bir karedir");
		}

		if (num1 != num2) {
			System.out.println("bu bir dik d�rtgendir");
		}

		Scanner sc1 = new Scanner(System.in);
		System.out.println("l�tfen dikd�rgen i�in en ve boy girin");
		int boy = sc1.nextInt();
		int en = sc1.nextInt();

		// uzun yol

		if (boy == en) {
			System.out.println("bu bir karedir");
		}

		if (en != boy) {
			System.out.println("bu bir dik d�rtgendir");
		}

		// else ==>di�er ihtimallerin tamam� i�in kullan�l�r di�er,ba�ka,de�ilse
		// demektir
		// k�sa yol
		if (boy == en) {
			System.out.println("bu bir karedir");
		} else {
			System.out.println("bu bir dik d�rtgendir");
		}

		sc.close();

		sc1.close();

	}

}
