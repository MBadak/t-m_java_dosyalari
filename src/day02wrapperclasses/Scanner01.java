package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {

		// kullan�c� iki tam say� versi pro�ram bu iki say�n�n toplam�n� ve �arp�m�n�
		// versin

		Scanner scan = new Scanner(System.in);

		// Scanner yaz�nca alt�nda k�rm�z� hata �izgisi ��kt� sa� t�klad�k import yapt�k
		// 3.sat�rdaki import ��kt�

		System.out.println("l�tfen iki tam say� giriniz");

		int say1 = scan.nextInt(); // say� 1 i olu�tursun
		int say2 = scan.nextInt(); // say� 2 i olu�tursun

		System.out.println(say1 + say2);
		System.out.println(say1 * say2);

		scan.close();
	}
}
