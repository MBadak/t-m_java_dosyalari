package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {

		// kullan�c�dan integer ald�ktan sonra String alam�yoruz.

		Scanner scan = new Scanner(System.in);
		System.out.println("ya��n�z� giriniz");
		// int ya�=scan.nextInt(); // bunu Strin yapt�k altta

		String ya� = scan.nextLine();
		int yeniya� = Integer.parseInt(ya�);

		System.out.println(yeniya�);

		System.out.println("Ad�n�z� soyad�n�z� giriniz");
		String isim = scan.nextLine();
		System.out.println(isim);

		scan.close();

	}

}
