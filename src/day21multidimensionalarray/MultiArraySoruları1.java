package day21multidimensionalarray;

public class MultiArraySoruları1 {

	public static void main(String[] args) {
		/*Aþaðýdaki multi dimensional array’in tum elemanlarýnýn çarpýmýný
		 *  ekrana yazdýran bir program yazýnýz. 
		 *   { {1,2,3}, {4,5,6} 
		 */
	
		int çar=1;
		int arr[][]= { {1,2,3}, {4,5,6} };
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				çar=çar*arr[i][j];
			}
		}
		System.out.println(çar);
		
	}

}
