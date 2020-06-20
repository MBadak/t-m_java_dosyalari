package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray01 {

	public static void main(String[] args) {
		// MultiDimensionalArray0  arrays içersindeki elemanlarda  arrays ise denir
		//Multi Dimensional Array  oluþturalým 2 boyutlu olaný yapalým 3 e gerek yok
		
		int arr[][]=new int [3][4]; // 3= 3 array olsun   4 =arraylarda 4 eleman olsun
		System.out.println(Arrays.toString(arr));   // I@4554617c, [I@74a14482, [I@1540e19d]
		System.out.println(Arrays.deepToString(arr)); // [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
// deðer atama 1 . yöntem tek tek yazmak
		arr[0][0]=1 ;
		arr[0][1]=2 ;
		arr[0][2]=3 ;
		arr[0][3]=4 ;
		
		arr[1][0]=4 ;
		arr[1][1]=5 ;
		arr[1][2]=6 ;
		arr[1][3]=7 ;

		arr[2][0]=8 ;
		arr[2][1]=9 ;
		arr[2][2]=0 ;
		arr[2][3]=1 ;

	
		
		System.out.println(Arrays.deepToString(arr));
		System.out.println(arr[1][2]);
		System.out.println(arr[0][2] + arr [2][1]);
	
		//        int a=0;
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				arr[i][j]=a;
//				a++;
//			}
//		}
//		System.out.println(Arrays.toString(arr));   // I@4554617c, [I@74a14482, [I@1540e19d]
//		System.out.println(Arrays.deepToString(arr)); // [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
//    
		
	}

}
