package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray02 {

	public static void main(String[] args) {
		// ararays e deðer atama 2. yol direk yazýyoruz.

		int arr[][] = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

		System.out.println(Arrays.deepToString(arr));

		System.out.println(arr[0][1] + arr[1][0] + arr[2][2]); // 2,3,6 toplamlarýný yazdýk

		// arr deki tüm elemanlarýn toplamýný veren proðramý yazýnýz

	// benim çözümüm 
	
		int birincitop = 0;
		for (int i = 0; i < arr[0].length; i++) {
			birincitop = birincitop + arr[0][i];
		}

		int ikincitop = 0;
		for (int i = 0; i < arr[1].length; i++) {
			ikincitop = ikincitop + arr[1][i];
		}

		int üçüncütop = 0;
		for (int j = 0; j < arr[2].length; j++) {
			üçüncütop = üçüncütop + arr[2][j];
		}

		System.out.println("toplam :" + (birincitop + ikincitop + üçüncütop));
	
		
		// hocanýn çözdüðü 
		
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum=sum + arr[i][j];
			}
		}
		System.out.println("Tüm elemanlarýn toplamý : " + sum);
		
	}
}
