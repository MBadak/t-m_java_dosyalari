package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {

		// karenin bir kenar uzunl��unu giriniz. karenin �evresini ve alan�n� ekrana
		// yazd�r�n�z.

		Scanner kare = new Scanner(System.in);
		System.out.println("l�tfen karenin bir kenar uzunlu�unu  giriniz :");
		System.out.print("karenin bir kenar�:");
		int say1 = kare.nextInt();

		System.out.print("karenin �evresi :");
		System.out.println(say1 * 4);
		System.out.print("karenin alan� :");
		System.out.println(say1 * say1);
		kare.close();
	}

}
