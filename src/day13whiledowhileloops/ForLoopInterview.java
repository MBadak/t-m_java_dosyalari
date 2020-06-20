package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview {

	public static void main(String[] args) {
		// Kullan�c�dan bir String al�n ve tersten yazd�r�n

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir c�mle veya kelime giriniz");

		String str = scan.nextLine();

		// 1. yol for loop ile

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println();

		// 2. yol while ile
		int uzunluk = str.length() - 1;

		while (uzunluk >= 0) {
			System.out.print(str.charAt(uzunluk));
			uzunluk--;

		}

		scan.close();
	}

}
