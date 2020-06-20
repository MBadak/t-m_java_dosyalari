package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// Ýki arrays oluþturup birbirine eþit olup olmadýðýný kontrol ediniz
		
		// iki arrays eþit olmasý demek iki þarta bakar
		// 1. Elemanlarý ayný olamalý
		// 2. Eþit elemanlarýn index leride eþit olmalý
		// {1,2,3} = {1,2,3}  ama {1,2,3}!0{1,3,2}
		
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
				
		System.out.println(arr1==arr2); // false verdi.    == adreslerede bakar o yüzde false
		System.out.println(Arrays.equals(arr1, arr2)); //true verir çünkü arrrays bu kodla  karþýlaþtýrýlýr.

		int arr3[]= {1,3,2};
		int arr4[]= {1,2,3};
		System.out.println(Arrays.equals(arr3, arr4)); // false sýralama farklý
	
	}

}
