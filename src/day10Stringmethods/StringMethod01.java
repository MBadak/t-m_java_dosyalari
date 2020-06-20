package day10Stringmethods;

public class StringMethod01 {

	public static void main(String[] args) {
		
		
		// indexOf() metodu nun 1. versiyonu     Stringin içindeki karakterin yerini belirler.
		
		String str1 = "Java World";
		
	
	System.out.println(str1.indexOf('v'));  // ekrana 2 yazdýrýr 0 1 2 3 .. diye gider.
	System.out.println(str1.indexOf('W'));  // 5
	System.out.println(str1.indexOf('w'));  // java karekter bulamayýnca -1 verir
	System.out.println(str1.indexOf('a'));	// tekrarlanan harflerde ilk karakterin yerini verir
	
	     // indexOf()   metodu2. versiyonu
	
	System.out.println(str1.indexOf('a',3)); // String teki ikinci a nýn indexini bulur	
											 // aramaya 3 karakterden itibaren baþlar
	//"Alamanya"  Stringindeki 2. anýn yerini bulmalýyýz
	
	String str2 ="Alamanya";
	int idx=str2.indexOf('a');
	System.out.println(str2.indexOf('a',idx +1 )); // önce 1. 'a' nýn yeri bulunur sonra bir fazlasý yazýlýr
	
	// indexOf()  metodunun 3. versiyonu
	
	String str3="Missisippi";
	str3.indexOf("is");
	System.out.println(str3.indexOf("is")); // 1 string de arayabilir ve ilk harfýn index ini verir
	System.out.println(str3.indexOf("ip")); // 6
	
	
	
	}

}
