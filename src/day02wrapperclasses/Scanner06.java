package day02wrapperclasses;

import java.util.Scanner;

public class Scanner06 {

	public static void main(String[] args) {

		Scanner dikd�rtgen = new Scanner(System.in);
		System.out.println("litfen bir en uzunlu�u giriniz");
		System.out.print("en uzunlu�u =");

		int en = dikd�rtgen.nextInt();

		System.out.println("litfen bir boy uzunlu�u giriniz");
		System.out.print("Boy uzunlu�u =");

		int boy = dikd�rtgen.nextInt();

		System.out.println("litfen bir en uy�kseklik giriniz");
		System.out.print("Y�kseklik uzunlu�u =");

		int y�kseklik = dikd�rtgen.nextInt();
		System.out.print("Dikd�rtgen Prizmas�n�n Hacmi =");
		System.out.println(en * boy * y�kseklik);
		dikd�rtgen.close();
	}

}
