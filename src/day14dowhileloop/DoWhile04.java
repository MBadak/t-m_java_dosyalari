package day14dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		// kullan�c�dan bir string al�n
		// bu sitringin indexsi tek say� olan karakterlerini ekrana yazd�r�n
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir kelime giriniz");
		String str = scan.nextLine();
		int i = 1;
		int son = str.length() - 1;

		do {
			System.out.print(str.charAt(i)+" ");
			i += 2;
		} while (i <= son);
scan.close();
	}

}
