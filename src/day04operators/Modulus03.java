package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		// kullan�c�dan �� basamakl� bir tam say� al�n. bu say�n�n t�m rakamlar�n�
		// toplay�n.
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen 3 basamakl� bir tam say� giriniz");
		int s1 = scan.nextInt();
		int ilkR = s1 / 100;
		int sonR = s1 % 10;
		int ortaR = (s1 % 100) / 10;
		System.out.println(ilkR);
		System.out.println(ortaR);

		System.out.println(sonR);
		System.out.println(ilkR + ortaR + sonR);

		scan.close();

	}

}
