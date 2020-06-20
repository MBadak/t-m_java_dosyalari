package day02wrapperclasses;

import java.util.Scanner;

public class Scanner07 {

	public static void main(String[] args) {
		Scanner daire = new Scanner(System.in);
		System.out.println("lütfen bir yarýçap giriniz");
		System.out.print("yarýçap= ");
		float pi = 3.14159f;
		float radius = daire.nextFloat();

		System.out.print("Dairenin Alaný=");
		System.out.println(pi * radius * radius);

		System.out.print("Dairenin çevresi =");
		System.out.println(2 * pi * radius);
		daire.close();
	}
}
