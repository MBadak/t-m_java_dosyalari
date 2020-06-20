package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		// Kullanicidan ilk ismini alin ekrana yazdirin.
		// Kullanicidan soy ismini alin ekrana ilk isminin altina yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Ilk isminizi yazýnýz");
		String isim = scan.nextLine(); // çift ismli olabilir nextline() kullanýlýr

		System.out.println("Soyisminizi yazýnýz");
		String soyisim = scan.nextLine(); // çift ismli olabilir nextline() kullanýlýr

		System.out.println(isim);
		System.out.println(soyisim);
		scan.close();
	}

}
