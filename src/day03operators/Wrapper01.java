package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("l�tfen ad soyad giriniz:");

		String isim = scan.nextLine(); // nextline() : t�m c�mleyi al�r,
										// next() : yanl�z bir kelime al�r.
		System.out.println(isim);

		scan.close();

	}

}
