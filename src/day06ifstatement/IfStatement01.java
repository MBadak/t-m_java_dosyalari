package day06ifstatement;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {

		// ko�ul ��mlesi yazacag�z.
		// �nce 1. durum: if ( buraya do�ru bir�ey yazd�k ) { buras� �al���r }
		// if ( buraya yanl�� bir�ey yazd�k ) { buras� �al��mad� }

		if (3 > 2) {
			System.out.println("3>2 do�ru oldugu i�in bunu ekrana yazd� ");
		}

		// int varible olu�tur
		// ona bir de�er atay�n
		// e�er atana de�er poziti ise ekrana pozitif yazd�r�n de�ilse negatif yazd�r�n

		int num = 0;
		if (num > 0) {
			System.out.println("pozitif");
		}
		if (num < 0) {
			System.out.println("negatif");
		}
		if (num == 0) {
			System.out.println("n�tr");
		}
		// girilen say�y�

		Scanner sc = new Scanner(System.in);
		System.out.println("l�tfen bir tam say� giriniz");
		int num1 = sc.nextInt();

		if (num1 > 0) {
			System.out.println("pozitif");
		}
		if (num1 < 0) {
			System.out.println("negatif");
		}
		if (num1 == 0) {
			System.out.println("n�tr");
		}
		sc.close();
	}

}
