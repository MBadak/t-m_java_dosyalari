package day10Stringmethods;

public class StringMethod01 {

	public static void main(String[] args) {
		
		
		// indexOf() metodu nun 1. versiyonu     Stringin i�indeki karakterin yerini belirler.
		
		String str1 = "Java World";
		
	
	System.out.println(str1.indexOf('v'));  // ekrana 2 yazd�r�r 0 1 2 3 .. diye gider.
	System.out.println(str1.indexOf('W'));  // 5
	System.out.println(str1.indexOf('w'));  // java karekter bulamay�nca -1 verir
	System.out.println(str1.indexOf('a'));	// tekrarlanan harflerde ilk karakterin yerini verir
	
	     // indexOf()   metodu2. versiyonu
	
	System.out.println(str1.indexOf('a',3)); // String teki ikinci a n�n indexini bulur	
											 // aramaya 3 karakterden itibaren ba�lar
	//"Alamanya"  Stringindeki 2. an�n yerini bulmal�y�z
	
	String str2 ="Alamanya";
	int idx=str2.indexOf('a');
	System.out.println(str2.indexOf('a',idx +1 )); // �nce 1. 'a' n�n yeri bulunur sonra bir fazlas� yaz�l�r
	
	// indexOf()  metodunun 3. versiyonu
	
	String str3="Missisippi";
	str3.indexOf("is");
	System.out.println(str3.indexOf("is")); // 1 string de arayabilir ve ilk harf�n index ini verir
	System.out.println(str3.indexOf("ip")); // 6
	
	
	
	}

}
