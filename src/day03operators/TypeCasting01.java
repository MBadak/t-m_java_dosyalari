package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {

		byte by = 101;
		int say� = by; // k���k data tipini b�y�k data tipine d�n��t�rmek i�in ekstra bir�eye gerek yok
						// java otomati de�i�tirir.
		System.out.println(say�);

		int say�2 = 53;
		byte by2 = (byte) say�2; // byte by2 = say�2; yazd�k hata verdi b�y�k olan� k���ge atd�n diyor. hata
									// byte by2 = (byte) say�2; (byte) yazarak biliyorum i�ime kar��ma deriz.
		System.out.println(by2);

		double say3 = 23.5;
		int by3 = (int) say3;
		System.out.println(by3);

		double say�5 = 4.8;
		double say�6 = 1.4;

		double sonu�1 = say�5 / say�6;
		System.out.println(sonu�1);

		int sonu�2 = (int) sonu�1;
		System.out.println(sonu�2);

		int say�7 = 5;
		int say�8 = 3;

		int sonu�3 = say�7 / say�8;
		System.out.println(sonu�3);

		int say�9 = 255;
		byte by5 = (byte) say�9;
		System.out.println(by5); // 255 g�rmeliyiz fakat byte s�n�r� 127 oldu�u i�in -1 g�z�k�r

	}

}
