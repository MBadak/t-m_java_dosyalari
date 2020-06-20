package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod01 {

	public static void main(String[] args) {
		// Verilen cümledeki boþlýklar hariç karakter sayýsýný bulunuz

		// 1. yol
		String cümle = "Verilen cümledeki boþlýklar hariç karakter sayýsýný bulunuz?";
		cümle=cümle.replace(" ",""); // boþluklar imha oldu

		String karakter[] = cümle.split("");
  
		System.out.println(Arrays.toString(karakter));
	 System.out.println("karakter sayýsý:" + (karakter.length));
  
     
     // 2. yol
     String cümle1 = "Verilen cümledeki boþlýklar hariç karakter sayýsýný bulunuz?";
	

		String karakter1[] = cümle1.split("");

		System.out.println(Arrays.toString(karakter));
		
		int a = 0;
		for (int i = 0; i < karakter1.length; i++) {

			if (karakter1[i].equals(" ")) {
				a++;
			}
		}
		
		System.out.println("karakter sayýsý:" + ((karakter1.length)-a));
     
	}

}
