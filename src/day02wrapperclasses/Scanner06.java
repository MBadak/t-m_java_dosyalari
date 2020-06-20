package day02wrapperclasses;

import java.util.Scanner;

public class Scanner06 {

	public static void main(String[] args) {

		Scanner dikdörtgen = new Scanner(System.in);
		System.out.println("litfen bir en uzunluðu giriniz");
		System.out.print("en uzunluðu =");

		int en = dikdörtgen.nextInt();

		System.out.println("litfen bir boy uzunluðu giriniz");
		System.out.print("Boy uzunluðu =");

		int boy = dikdörtgen.nextInt();

		System.out.println("litfen bir en uyükseklik giriniz");
		System.out.print("Yükseklik uzunluðu =");

		int yükseklik = dikdörtgen.nextInt();
		System.out.print("Dikdörtgen Prizmasýnýn Hacmi =");
		System.out.println(en * boy * yükseklik);
		dikdörtgen.close();
	}

}
