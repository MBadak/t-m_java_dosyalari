package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray02 {

	public static void main(String[] args) {
		// ararays e de�er atama 2. yol direk yaz�yoruz.

		int arr[][] = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

		System.out.println(Arrays.deepToString(arr));

		System.out.println(arr[0][1] + arr[1][0] + arr[2][2]); // 2,3,6 toplamlar�n� yazd�k

		// arr deki t�m elemanlar�n toplam�n� veren pro�ram� yaz�n�z

	// benim ��z�m�m 
	
		int birincitop = 0;
		for (int i = 0; i < arr[0].length; i++) {
			birincitop = birincitop + arr[0][i];
		}

		int ikincitop = 0;
		for (int i = 0; i < arr[1].length; i++) {
			ikincitop = ikincitop + arr[1][i];
		}

		int ���nc�top = 0;
		for (int j = 0; j < arr[2].length; j++) {
			���nc�top = ���nc�top + arr[2][j];
		}

		System.out.println("toplam :" + (birincitop + ikincitop + ���nc�top));
	
		
		// hocan�n ��zd��� 
		
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum=sum + arr[i][j];
			}
		}
		System.out.println("T�m elemanlar�n toplam� : " + sum);
		
	}
}
