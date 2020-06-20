package day14dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		// kullanýcýdan bir string alýn
		// bu sitringin indexsi tek sayý olan karakterlerini ekrana yazdýrýn
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
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
