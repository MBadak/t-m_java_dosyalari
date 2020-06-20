package day04operators;

import java.util.Scanner;

public class Soru002 {

	public static void main(String[] args) {
		// 4 haneli giþrilen sayýlarýn basamaklarýný toplamak

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen 4 haneli tam sayý giriniz");
		int say1 = scan.nextInt();
		int binler = say1 / 1000;
		int v = say1 / 100;
		int yuzler = v % 10;
		int v2 = say1 / 10;
		int onlar = v2 % 10;
		int birler = say1 % 10;

		System.out.print("binler:");
		System.out.println(binler);

		System.out.print("yuzler:");
		System.out.println(yuzler);

		System.out.print("onlar:");
		System.out.println(onlar);

		System.out.print("birler:");
		System.out.println(birler);

		System.out.print("toplamlarý:");
		System.out.println(binler + yuzler + onlar + birler);
		scan.close();
	}

}
