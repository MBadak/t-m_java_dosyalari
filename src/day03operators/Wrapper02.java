package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		// Kullanicidan ilk ismini alin ekrana yazdirin.
		// Kullanicidan soy ismini alin ekrana ilk isminin altina yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Ilk isminizi yaz�n�z");
		String isim = scan.nextLine(); // �ift ismli olabilir nextline() kullan�l�r

		System.out.println("Soyisminizi yaz�n�z");
		String soyisim = scan.nextLine(); // �ift ismli olabilir nextline() kullan�l�r

		System.out.println(isim);
		System.out.println(soyisim);
		scan.close();
	}

}
