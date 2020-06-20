package day01variables;

public class Variable01 {

	public static void main(String[] args) {

		int maa� = 3000; // rakam yaz�yoruz '..' gerek yok
		char harf = 's'; // tek karakter yazmak i�in kullan�l�r ve yaz�cak karakter mutlaka ' ' aras�n
							// ayaz�lmal�.

		System.out.println(maa�); // 3000 olarak g�r�lmeli ekranda
		System.out.println(harf); // s olarak g�r�lmeli ekranda

		int say� = 123;
		System.out.println(say�);
		/*
		 * 1-b�y�k k���k harf �nemlidir "money" , "Money" "MONEY" bunlar farkl��dr 2-
		 * ilk ba�lang� $ , _ , yada harf olmal� (1ali, +ali, ) olmaz ($ali, _ali , ali1
		 * ) olur. 3- baz� kelimeler rezervedir, java kulland�rmaz (�rn: int, for, if,
		 * import, ...vb) 4- variable isimleri k���k harlae yaz�l�r. iki kelime
		 * yazacaksan�z k���kle ba�lamal� sonraki kelimelerin ba� harfi b�y�k olmal�
		 * (�rn: bigApple, ageJohnWalker , ...vb) note: camelCase g�re isim verilir (
		 * deve h�rg�c� )
		 */

		boolean isOld = false; // boolean lar i�in sadece true(do�ru) vaya false(yanl��) degere sahip
		System.out.println(isOld);

		boolean istNew = true;
		System.out.println(istNew);

		byte derinlik = -24; // 8 bit yer kaplar -128 ile 127 say�lar aras� yaz�l�r. ��reci ya�lar� i�in
								// uygundur az yer kaplar
		System.out.println(derinlik);

		short nazilliNufus = 28012; // 16 bit yer kaplar -32768 ile 32767 say�lar� aras�yazar
		System.out.println(nazilliNufus);

		int ankaraNufusu = 4000000; // -2147483848 ile 2147483847 aras�n� yazar, 32 bit yer kaplar
		System.out.println(ankaraNufusu);

		long hucreSay�s� = 123456789123456L; // say� uzun eminseni sonuna L yaz�n diyor. 64 bit yer kaplar 19 haneli
												// say� i�in kullan�l�r

		System.out.println(hucreSay�s�);

		double pi = 3.145678; // 64 bit kullan�r virg�ll� say�lar� yazar
		System.out.println(pi);

		float dolar = 6.874356f; // 32 bit yer kaplar k���k virg�ll� say�lar kullan�r,ama java hep double olarak
									// g�r�r bunun i�in sonuna f yazmal�
		System.out.println(dolar);

		String ��renci�smi = "Ali Can"; // yan yana charlar i�in kullan�l�r
		System.out.println(��renci�smi);

	}
}
