package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		// kullanýcýnýn girdigi 4 basamaklý sayýnýn ilk ve son rakamýnýn toplamýný veren
		// proðrm yapýnýz.

		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen 4 basamaklý bir tam sayý giriniz:");

		int say1 = scan.nextInt(); // diyelim ki 1234 girdi,son basamak için 10 bölersek kalan 4 olur.
		System.out.println(say1);
		int sonRakam = say1 % 10; // 10 böler kalaný alýrým
		int ilkRakam = say1 / 1000; // 1000 bölerim
		System.out.println(sonRakam + ilkRakam);

		scan.close();

	}

}
