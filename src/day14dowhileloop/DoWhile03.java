package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// kullan�c�dan say� al�n
		// say� 10 dan k���kse ekrana kazand�n�z yazs�n
        // say�  10 veya 10 dan b�y�kse "bir say� giriniz" desin
		Scanner scan = new Scanner(System.in);
		int num=0;

		do {
			System.out.println("L�tfen bir say� giriniz");
		     num= scan.nextInt();
		}while (num>=10);
		
		System.out.println("kazand�n�z");
		
		scan.close();
	}

}
