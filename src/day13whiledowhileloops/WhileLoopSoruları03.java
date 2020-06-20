package day13whiledowhileloops;

import java.util.Scanner;

public class WhileLoopSoruları03 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir sayý alýn ve bu sayýnýn bölenlerini ekrana yazdýrýnýz.
		 * Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.
		 * hem for loop hem de while loop kullanarak çözünüz.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen sayý girin");
		int num = scan.nextInt();

		for (int i = 1; i < num + 1; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		int i = 1;
		while (i < num + 1) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		scan.close();
	}

}
