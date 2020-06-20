package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
		// Kullanicidan 6 basamakli bir sayi isteyin. 0 ile de baslayabilir
		// Kazanma ihtimali %20, amorti ihtimali %30, kaybetme ihtimali %50 olan bir
		// jackpot oyunu icin program yaziniz.
		// 000000 ,000001 ,000002 ......9999998, 999999

		Scanner sc = new Scanner(System.in);
		System.out.println("6 basmaklý bir tam sayý giriniz, 0 kullanýlabilir");
		int num = sc.nextInt();
		if (num < 200000) {
			System.out.println("kazandýnýz");
		} else if (num < 500) {
			System.out.println("Tekrar deneyin");
		} else {
			System.out.println("kaybettiniz");
		}
		sc.close();
	}

}
