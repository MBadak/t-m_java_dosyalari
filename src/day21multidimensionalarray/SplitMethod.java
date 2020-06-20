package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		
		// kelime sayýsýný bulalým
		
	String str="Ali Can okula baþladý";
	// str.split(" " ); elemanlarý parçalara ayýrmaya yarar. 
	// parçalananlarý koymak için mutlaka bir Arrays oluþturmalýyýz.
	
	String kelime[]=str.split(" ");
	
	System.out.println(Arrays.toString(kelime));
	
	System.out.println("kelime sayýsý :"+kelime.length);
	
	// karakter sayýsýný bulalým
	
	String str1="Ali Can okula baþladý";
	
	String karakter[]=str1.split("");
	
	System.out.println(Arrays.toString(karakter));
	
	System.out.println("Karakter sayýsý :"+karakter.length);
 		
	}
}
