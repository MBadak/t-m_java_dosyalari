package day02wrapperclasses;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		/*
		 * Yarýçapý kullanýcýdan alýnan bir dairenin çevresini ve alanýný hesaplayan bir
		 * program yazýnýz. (float kullanýnýz) Not 1: pi sayýsý: 3.14159 Not 2: Alan:
		 * 3.14159 x radius x radius Not 3: Cevre: 2 x 3.14159 x radius
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen yarýçapý giriniz:");
		System.out.print("yarýçap=");
		double yarýcap = scan.nextDouble();

		System.out.print("dairenin Alaný:");
		System.out.println(3.14159 * yarýcap * yarýcap);

		System.out.print("dairenin çevresi =");

		System.out.println(2 * yarýcap * 3.14159);

		scan.close();

	}
}
