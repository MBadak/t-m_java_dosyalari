package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {

		// kullanýcý iki tam sayý versi proðram bu iki sayýnýn toplamýný ve çarpýmýný
		// versin

		Scanner scan = new Scanner(System.in);

		// Scanner yazýnca altýnda kýrmýzý hata çizgisi çýktý sað týkladýk import yaptýk
		// 3.satýrdaki import çýktý

		System.out.println("lütfen iki tam sayý giriniz");

		int say1 = scan.nextInt(); // sayý 1 i oluþtursun
		int say2 = scan.nextInt(); // sayý 2 i oluþtursun

		System.out.println(say1 + say2);
		System.out.println(say1 * say2);

		scan.close();
	}
}
