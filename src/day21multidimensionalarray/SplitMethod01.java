package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod01 {

	public static void main(String[] args) {
		// Verilen c�mledeki bo�l�klar hari� karakter say�s�n� bulunuz

		// 1. yol
		String c�mle = "Verilen c�mledeki bo�l�klar hari� karakter say�s�n� bulunuz?";
		c�mle=c�mle.replace(" ",""); // bo�luklar imha oldu

		String karakter[] = c�mle.split("");
  
		System.out.println(Arrays.toString(karakter));
	 System.out.println("karakter say�s�:" + (karakter.length));
  
     
     // 2. yol
     String c�mle1 = "Verilen c�mledeki bo�l�klar hari� karakter say�s�n� bulunuz?";
	

		String karakter1[] = c�mle1.split("");

		System.out.println(Arrays.toString(karakter));
		
		int a = 0;
		for (int i = 0; i < karakter1.length; i++) {

			if (karakter1[i].equals(" ")) {
				a++;
			}
		}
		
		System.out.println("karakter say�s�:" + ((karakter1.length)-a));
     
	}

}
