package day02wrapperclasses;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		/*
		 * Yar��ap� kullan�c�dan al�nan bir dairenin �evresini ve alan�n� hesaplayan bir
		 * program yaz�n�z. (float kullan�n�z) Not 1: pi say�s�: 3.14159 Not 2: Alan:
		 * 3.14159 x radius x radius Not 3: Cevre: 2 x 3.14159 x radius
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen yar��ap� giriniz:");
		System.out.print("yar��ap=");
		double yar�cap = scan.nextDouble();

		System.out.print("dairenin Alan�:");
		System.out.println(3.14159 * yar�cap * yar�cap);

		System.out.print("dairenin �evresi =");

		System.out.println(2 * yar�cap * 3.14159);

		scan.close();

	}
}
