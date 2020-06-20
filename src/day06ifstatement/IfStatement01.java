package day06ifstatement;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {

		// koþul çümlesi yazacagýz.
		// önce 1. durum: if ( buraya doðru birþey yazdýk ) { burasý çalýþýr }
		// if ( buraya yanlýþ birþey yazdýk ) { burasý çalýþmadý }

		if (3 > 2) {
			System.out.println("3>2 doðru oldugu için bunu ekrana yazdý ");
		}

		// int varible oluþtur
		// ona bir deðer atayýn
		// eðer atana deðer poziti ise ekrana pozitif yazdýrýn deðilse negatif yazdýrýn

		int num = 0;
		if (num > 0) {
			System.out.println("pozitif");
		}
		if (num < 0) {
			System.out.println("negatif");
		}
		if (num == 0) {
			System.out.println("nötr");
		}
		// girilen sayýyý

		Scanner sc = new Scanner(System.in);
		System.out.println("lütfen bir tam sayý giriniz");
		int num1 = sc.nextInt();

		if (num1 > 0) {
			System.out.println("pozitif");
		}
		if (num1 < 0) {
			System.out.println("negatif");
		}
		if (num1 == 0) {
			System.out.println("nötr");
		}
		sc.close();
	}

}
