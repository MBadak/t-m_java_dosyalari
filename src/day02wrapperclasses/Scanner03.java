package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {

		// kullanýcýdan alýna sayýnýn küpünü hesapla

		Scanner küpal = new Scanner(System.in);
		System.out.println("lütfen bir tam sayý giriniz:");
		System.out.print("sayý:");
		int say1 = küpal.nextInt();
		System.out.print("sayýnýn küpü:");
		System.out.println(say1 * say1 * say1);
		küpal.close();
	}

}
