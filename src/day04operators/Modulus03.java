package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		// kullanýcýdan üç basamaklý bir tam sayý alýn. bu sayýnýn tüm rakamlarýný
		// toplayýn.
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen 3 basamaklý bir tam sayý giriniz");
		int s1 = scan.nextInt();
		int ilkR = s1 / 100;
		int sonR = s1 % 10;
		int ortaR = (s1 % 100) / 10;
		System.out.println(ilkR);
		System.out.println(ortaR);

		System.out.println(sonR);
		System.out.println(ilkR + ortaR + sonR);

		scan.close();

	}

}
