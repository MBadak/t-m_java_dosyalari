package day15methodcreation;

import java.util.Scanner;

public class MethodCreation03 {

	public static void main(String[] args) {
		// Basit hesap makinasi
		// Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalim
		// Kullanicidan iki sayi girmesini isteyelim
		// Girlen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdiralim.

		Scanner scan = new Scanner(System.in);
		System.out.println("1. sayý");
		double num1 = scan.nextDouble();
		System.out.println("+,-,x,: iþlemlerinden birini seçiniz");
		char iþlem = scan.next().charAt(0);

		System.out.println("2. sayý");
		double num2 = scan.nextDouble();

		hesapMakinasý(iþlem, num1, num2);
		scan.close();
	}

	public static void hesapMakinasý(char iþlem, double num1, double num2) {

		switch (iþlem) {

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
			System.out.println("+,-,x,: dýþýnda girmeyiniz");

		}

	}

}
