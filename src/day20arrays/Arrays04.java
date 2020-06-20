package day20arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		//Bir Arrays in i�ersinde belli bir eleman�n var olup olmad���n� bulal�m
		// binarySearch() bu i� i�in kullan�l�r.
		// �nemli uyar�: binarySearch() methodunu kullanmadan �nce sort() methodu ile s�ralanmal�
		// yoksa sa�ma sonu�lar verebilir g�venilmez
		
		// verilen  Arrayde 3 varm� yokmu?
		int arr[]= {1,2,5,4,3,2};
		
		Arrays.sort(arr);
		
	System.out.println(Arrays.binarySearch(arr,3)); // de�erleri s�ralar ve index ini verir 2 verir
	System.out.println(Arrays.binarySearch(arr,5)); // de�erleri s�ralar ve index ini verir 4 verir
	System.out.println(Arrays.binarySearch(arr,1)); // de�erleri s�ralar ve index ini verir 0 verir
	System.out.println(Arrays.binarySearch(arr,2)); // de�erleri s�ralar ve ilk yakalad���n�n index ini verir 1 verir
	System.out.println(Arrays.binarySearch(arr,9)); // olmayanlar i�in index ini verir -7 verir
											// (-) yok demek , say�(7) ise olsa idi bu indexde olurdu demek
	}

}
