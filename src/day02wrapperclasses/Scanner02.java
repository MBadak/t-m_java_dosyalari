package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {

		// karenin bir kenar uzunlýðunu giriniz. karenin çevresini ve alanýný ekrana
		// yazdýrýnýz.

		Scanner kare = new Scanner(System.in);
		System.out.println("lütfen karenin bir kenar uzunluðunu  giriniz :");
		System.out.print("karenin bir kenarý:");
		int say1 = kare.nextInt();

		System.out.print("karenin çevresi :");
		System.out.println(say1 * 4);
		System.out.print("karenin alaný :");
		System.out.println(say1 * say1);
		kare.close();
	}

}
