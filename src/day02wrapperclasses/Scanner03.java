package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {

		// kullan�c�dan al�na say�n�n k�p�n� hesapla

		Scanner k�pal = new Scanner(System.in);
		System.out.println("l�tfen bir tam say� giriniz:");
		System.out.print("say�:");
		int say1 = k�pal.nextInt();
		System.out.print("say�n�n k�p�:");
		System.out.println(say1 * say1 * say1);
		k�pal.close();
	}

}
