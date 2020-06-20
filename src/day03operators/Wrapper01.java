package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("lütfen ad soyad giriniz:");

		String isim = scan.nextLine(); // nextline() : tüm cümleyi alýr,
										// next() : yanlýz bir kelime alýr.
		System.out.println(isim);

		scan.close();

	}

}
