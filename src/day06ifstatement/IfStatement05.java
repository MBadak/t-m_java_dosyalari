package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		// kulanucýdan en ve boy al
		// en ve boy eþitse kare desin deðilse dikdörtgen desin

		Scanner sc = new Scanner(System.in);
		System.out.println("lütfen dikdörgen için iki tam sayý girin");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if (num1 == num2) {
			System.out.println("bu bir karedir");
		}

		if (num1 != num2) {
			System.out.println("bu bir dik dörtgendir");
		}

		Scanner sc1 = new Scanner(System.in);
		System.out.println("lütfen dikdörgen için en ve boy girin");
		int boy = sc1.nextInt();
		int en = sc1.nextInt();

		// uzun yol

		if (boy == en) {
			System.out.println("bu bir karedir");
		}

		if (en != boy) {
			System.out.println("bu bir dik dörtgendir");
		}

		// else ==>diðer ihtimallerin tamamý için kullanýlýr diðer,baþka,deðilse
		// demektir
		// kýsa yol
		if (boy == en) {
			System.out.println("bu bir karedir");
		} else {
			System.out.println("bu bir dik dörtgendir");
		}

		sc.close();

		sc1.close();

	}

}
