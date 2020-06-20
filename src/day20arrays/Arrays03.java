package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// �ki arrays olu�turup birbirine e�it olup olmad���n� kontrol ediniz
		
		// iki arrays e�it olmas� demek iki �arta bakar
		// 1. Elemanlar� ayn� olamal�
		// 2. E�it elemanlar�n index leride e�it olmal�
		// {1,2,3} = {1,2,3}  ama {1,2,3}!0{1,3,2}
		
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
				
		System.out.println(arr1==arr2); // false verdi.    == adreslerede bakar o y�zde false
		System.out.println(Arrays.equals(arr1, arr2)); //true verir ��nk� arrrays bu kodla  kar��la�t�r�l�r.

		int arr3[]= {1,3,2};
		int arr4[]= {1,2,3};
		System.out.println(Arrays.equals(arr3, arr4)); // false s�ralama farkl�
	
	}

}
