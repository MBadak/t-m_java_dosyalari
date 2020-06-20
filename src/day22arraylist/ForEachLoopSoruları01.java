package day22arraylist;

import java.util.Arrays;

public class ForEachLoopSoruları01 {

	public static void main(String[] args) {
		// Bir integer array oluþturunuz
		// ve bu array’deki tum sayýlarýn
		// çarpýmýný For-each loop kullanarak bulunuz.
		// Sonucu ekrana yazdýrýnýz.

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(arr));
		int çar = 1;
		for (int w : arr) {
			çar = çar * w;

		}
		System.out.println("Tüm elemanlarýnýn çarpýmý : "+çar);

	}

}
