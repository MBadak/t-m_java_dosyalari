package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// int Array olu�tural�m

		int arr[] = new int[5]; // arr = isim , [5] = 5 tane int olusturur

		System.out.println(arr + "    <== bu arrays adresidir herkeste farkl�d�r");

		System.out.println(arr[2] + "   <== index i 2 olan "); // arr[2] deki 2 ; Array�n indeksi 2 olan de�eri alacak
																// demektir

		char arr1[] = new char[3];

		System.out.println(arr1[2]);

		// Arraya nas�l de�er atar�z?
		arr[0] = 12;
		arr[1] = 232;
		arr[2] = 33323;
		arr[3] = 14;
		arr[4] = 3445;
		// arr[5]=766; // Arrayda olamyan index'e de�er de�er atmas� yap�l�rsa Run time
		// error verir
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}

	}

}
