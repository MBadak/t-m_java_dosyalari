package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		// kullan�c�n�n girdigi 4 basamakl� say�n�n ilk ve son rakam�n�n toplam�n� veren
		// pro�rm yap�n�z.

		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen 4 basamakl� bir tam say� giriniz:");

		int say1 = scan.nextInt(); // diyelim ki 1234 girdi,son basamak i�in 10 b�lersek kalan 4 olur.
		System.out.println(say1);
		int sonRakam = say1 % 10; // 10 b�ler kalan� al�r�m
		int ilkRakam = say1 / 1000; // 1000 b�lerim
		System.out.println(sonRakam + ilkRakam);

		scan.close();

	}

}
