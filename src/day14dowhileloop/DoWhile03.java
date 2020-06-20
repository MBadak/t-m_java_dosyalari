package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// kullanýcýdan sayý alýn
		// sayý 10 dan küçükse ekrana kazandýnýz yazsýn
        // sayý  10 veya 10 dan büyükse "bir sayý giriniz" desin
		Scanner scan = new Scanner(System.in);
		int num=0;

		do {
			System.out.println("Lütfen bir sayý giriniz");
		     num= scan.nextInt();
		}while (num>=10);
		
		System.out.println("kazandýnýz");
		
		scan.close();
	}

}
