package day21multidimensionalarray;

public class MultiArraySoruları2 {

	public static void main(String[] args) {
	/*Aþaðýdaki multi dimensional array’in iç array’lerindeki son elemanlarýn 
	 * çarpýmýný ekrana yazdýran  bir program yazýnýz { {1,2,3}, {4,5}, {6} 
	 */
		int arr[][]={ {1,2,3}, {4,5}, {6}};
		int çar=1;
		
		for (int i = 0; i < arr.length; i++) {
			 çar=çar*arr[i][arr[i].length-1];
		}
		System.out.println(çar);
		
		

	}

}
