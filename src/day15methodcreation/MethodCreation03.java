package day15methodcreation;

import java.util.Scanner;

public class MethodCreation03 {

	public static void main(String[] args) {
		// Basit hesap makinasi
		// Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalim
		// Kullanicidan iki sayi girmesini isteyelim
		// Girlen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdiralim.

		Scanner scan = new Scanner(System.in);
		System.out.println("1. say�");
		double num1 = scan.nextDouble();
		System.out.println("+,-,x,: i�lemlerinden birini se�iniz");
		char i�lem = scan.next().charAt(0);

		System.out.println("2. say�");
		double num2 = scan.nextDouble();

		hesapMakinas�(i�lem, num1, num2);
		scan.close();
	}

	public static void hesapMakinas�(char i�lem, double num1, double num2) {

		switch (i�lem) {

		case '+':
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case '-':
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		case 'x':
			System.out.println(num1 + "x" + num2 + "=" + (num1 * num2));
			break;
		case ':':
			System.out.println(num1 + ":" + num2 + "=" + (num1 / num2));
			break;
		default:
			System.out.println("+,-,x,: d���nda girmeyiniz");

		}

	}

}
