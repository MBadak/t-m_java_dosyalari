package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {

		// Kullanicidan ad ve soyadini alalim ekrana yazdiralim
		// Kullanicidan adresini alalim ekrana yazdiralim (2. cadde Bakirkoy Istanbul
		// Turkiye)
		// Kullanicidan yasini alalim ekrana yazdiralim.
		// Kullaniciya "Turkiye'de yasiyorum. Dogru/Yanlis" diye soralim cevabini ekrana
		// yazdiralim
		// true veya false olarak

		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen ad ve sayad giriniz");

		String isim = scan.nextLine();
		System.out.println(isim);
		System.out.println("l�tfen adresinizi giriniz");
		String adres = scan.nextLine();
		System.out.println(adres);
		System.out.println("l�tfen ya��n�z� giriniz");

		int ya� = scan.nextInt();
		System.out.println(ya�);
		System.out.println("Turkiye'de yasiyorum true/false");

		boolean dog = scan.nextBoolean();
		System.out.println(dog);
		scan.close();
	}

}
