package day22arraylist;

import java.util.Arrays;

public class ForEachLoopSoruları04 {

	public static void main(String[] args) {
//		Bir String oluþturunuz, bu String’deki character’leri yukarýdan aþaðýya
//		for-each loop kullanarak yazdýrýnýz.
//		Ýpucu: split()
		
	 
		String str= "Ankara'nýn baðlarý";
		String arr[]= str.split("");
		
		System.out.println(Arrays.deepToString(arr));
		for (String w : arr) {
			System.out.println(w);
		}
		
	}

}
