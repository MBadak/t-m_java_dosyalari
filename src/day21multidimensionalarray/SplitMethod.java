package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		
		// kelime say�s�n� bulal�m
		
	String str="Ali Can okula ba�lad�";
	// str.split(" " ); elemanlar� par�alara ay�rmaya yarar. 
	// par�alananlar� koymak i�in mutlaka bir Arrays olu�turmal�y�z.
	
	String kelime[]=str.split(" ");
	
	System.out.println(Arrays.toString(kelime));
	
	System.out.println("kelime say�s� :"+kelime.length);
	
	// karakter say�s�n� bulal�m
	
	String str1="Ali Can okula ba�lad�";
	
	String karakter[]=str1.split("");
	
	System.out.println(Arrays.toString(karakter));
	
	System.out.println("Karakter say�s� :"+karakter.length);
 		
	}
}
