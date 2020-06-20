package day01variables;

public class Variable01 {

	public static void main(String[] args) {

		int maaþ = 3000; // rakam yazýyoruz '..' gerek yok
		char harf = 's'; // tek karakter yazmak için kullanýlýr ve yazýcak karakter mutlaka ' ' arasýn
							// ayazýlmalý.

		System.out.println(maaþ); // 3000 olarak görülmeli ekranda
		System.out.println(harf); // s olarak görülmeli ekranda

		int sayý = 123;
		System.out.println(sayý);
		/*
		 * 1-büyük küçük harf önemlidir "money" , "Money" "MONEY" bunlar farklýýdr 2-
		 * ilk baþlangý $ , _ , yada harf olmalý (1ali, +ali, ) olmaz ($ali, _ali , ali1
		 * ) olur. 3- bazý kelimeler rezervedir, java kullandýrmaz (örn: int, for, if,
		 * import, ...vb) 4- variable isimleri küçük harlae yazýlýr. iki kelime
		 * yazacaksanýz küçükle baþlamalý sonraki kelimelerin baþ harfi büyük olmalý
		 * (örn: bigApple, ageJohnWalker , ...vb) note: camelCase göre isim verilir (
		 * deve hörgücü )
		 */

		boolean isOld = false; // boolean lar için sadece true(doðru) vaya false(yanlýþ) degere sahip
		System.out.println(isOld);

		boolean istNew = true;
		System.out.println(istNew);

		byte derinlik = -24; // 8 bit yer kaplar -128 ile 127 sayýlar arasý yazýlýr. öðreci yaþlarý için
								// uygundur az yer kaplar
		System.out.println(derinlik);

		short nazilliNufus = 28012; // 16 bit yer kaplar -32768 ile 32767 sayýlarý arasýyazar
		System.out.println(nazilliNufus);

		int ankaraNufusu = 4000000; // -2147483848 ile 2147483847 arasýný yazar, 32 bit yer kaplar
		System.out.println(ankaraNufusu);

		long hucreSayýsý = 123456789123456L; // sayý uzun eminseni sonuna L yazýn diyor. 64 bit yer kaplar 19 haneli
												// sayý için kullanýlýr

		System.out.println(hucreSayýsý);

		double pi = 3.145678; // 64 bit kullanýr virgüllü sayýlarý yazar
		System.out.println(pi);

		float dolar = 6.874356f; // 32 bit yer kaplar küçük virgüllü sayýlar kullanýr,ama java hep double olarak
									// görür bunun için sonuna f yazmalý
		System.out.println(dolar);

		String öðrenciÝsmi = "Ali Can"; // yan yana charlar için kullanýlýr
		System.out.println(öðrenciÝsmi);

	}
}
