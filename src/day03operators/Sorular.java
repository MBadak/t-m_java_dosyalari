package day03operators;

public class Sorular {

	public static void main(String[] args) {

		/*
		 * 3) Ni�in hata veriyor? Bu hatay� iki farkl� yolla ��z�n�z. float num1=3.23;
		 * double num2=3.23;
		 */ /*
			 * virg�ll� say�lar� hep double olarak g�r�r bunun i�in 1- sonuna L veya l
			 * eklemeli 2- = (float) yazmal�
			 */

		float num1 = (float) 3.23;
		double num2 = 3.23;
		System.out.println(num1 + num2);
		// 4- 4) double100.235 i int�e �evirip ekrana yazdiriniz

		double num3 = 100.235;
		int i1 = (int) num3;
		System.out.println(i1); // 100

		/*
		 * 5 5) int data type��nda olu�turulan 5 say�s� ile double data type��nda
		 * olu�turulan 6.2 say�s�n� toplay�p sonucu ekrana yazd�r�n�z
		 */

		int i2 = 5;
		double say1 = 6.2;

		System.out.println(i2 + say1);

		/*
		 * 6 ekran g�r���n�z nedir?
		 * 
		 * byte say2=(byte) 255; System.out.println(say2);
		 */
		byte say2 = (byte) 255;
		System.out.println(say2); // -1

		// 7

		int de = 5 / 2;
		System.out.println(de); // 2

		float de1 = 5f / 2f;
		System.out.println(de1); // 2.5

		double de2 = 5d / 2d;
		System.out.println(de2); // 2.5

		// 8

		int as1 = 5 / 3;
		System.out.println(as1); // 1

		float as2 = 5f / 3f;
		System.out.println(as2); // 1.......

		double as3 = 5d / 3d;
		System.out.println(as3); // 1...............

	}
}
