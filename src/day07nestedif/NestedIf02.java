package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// Kullanicidan password girmesini isteyin
		// Password 4 basamakli bir sayi ise cift olup olmadigini kontrol edin
		// Cift sayi ise ekrana �Password tamam� yazdirin, Tek sayi ise ��i�t say� girin
		// yazdirin�
		// Password 4 basamakli degil ise �4 basamakl� girin� yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen password giriniz");

		int psw = scan.nextInt();

		if (psw > 999 && 10000 > psw) {
			if (psw % 2 == 0) {
				System.out.println("password tamam");
			} else if (psw % 2 != 0) {
				System.out.println("�ift say� girin");
			}
		} else {
			System.out.println("4 basamakl� girin");
		}
		scan.close();
	}

}
