package day02wrapperclasses;

import java.util.Scanner;

public class Scanner08 {

	public static void main(String[] args) {
		Scanner ücgen = new Scanner(System.in);

		System.out.println("Lütfen üçgenin kernarlarýný giriniz");
		System.out.print("k1=");
		int k1 = ücgen.nextInt();
		System.out.print("k2=");
		int k2 = ücgen.nextInt();
		System.out.print("k3=");
		int k3 = ücgen.nextInt();
		System.out.println("üçgenin Çevresi=");
		System.out.println(k1 + k2 + k3);
		ücgen.close();
	}
}
