package day02wrapperclasses;

import java.util.Scanner;

public class Scanner07 {

	public static void main(String[] args) {
		Scanner daire = new Scanner(System.in);
		System.out.println("l�tfen bir yar��ap giriniz");
		System.out.print("yar��ap= ");
		float pi = 3.14159f;
		float radius = daire.nextFloat();

		System.out.print("Dairenin Alan�=");
		System.out.println(pi * radius * radius);

		System.out.print("Dairenin �evresi =");
		System.out.println(2 * pi * radius);
		daire.close();
	}
}
