package day02wrapperclasses;

import java.util.Scanner;

public class Scanner08 {

	public static void main(String[] args) {
		Scanner �cgen = new Scanner(System.in);

		System.out.println("L�tfen ��genin kernarlar�n� giriniz");
		System.out.print("k1=");
		int k1 = �cgen.nextInt();
		System.out.print("k2=");
		int k2 = �cgen.nextInt();
		System.out.print("k3=");
		int k3 = �cgen.nextInt();
		System.out.println("��genin �evresi=");
		System.out.println(k1 + k2 + k3);
		�cgen.close();
	}
}
