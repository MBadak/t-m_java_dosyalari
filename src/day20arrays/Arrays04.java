package day20arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		//Bir Arrays in içersinde belli bir elemanýn var olup olmadýðýný bulalým
		// binarySearch() bu iþ için kullanýlýr.
		// önemli uyarý: binarySearch() methodunu kullanmadan önce sort() methodu ile sýralanmalý
		// yoksa saçma sonuçlar verebilir güvenilmez
		
		// verilen  Arrayde 3 varmý yokmu?
		int arr[]= {1,2,5,4,3,2};
		
		Arrays.sort(arr);
		
	System.out.println(Arrays.binarySearch(arr,3)); // deðerleri sýralar ve index ini verir 2 verir
	System.out.println(Arrays.binarySearch(arr,5)); // deðerleri sýralar ve index ini verir 4 verir
	System.out.println(Arrays.binarySearch(arr,1)); // deðerleri sýralar ve index ini verir 0 verir
	System.out.println(Arrays.binarySearch(arr,2)); // deðerleri sýralar ve ilk yakaladýðýnýn index ini verir 1 verir
	System.out.println(Arrays.binarySearch(arr,9)); // olmayanlar için index ini verir -7 verir
											// (-) yok demek , sayý(7) ise olsa idi bu indexde olurdu demek
	}

}
