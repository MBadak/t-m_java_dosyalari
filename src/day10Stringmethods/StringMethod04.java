package day10Stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
		
		// contains(); methodu 
		// bir Stringin i�ersinde bir karakterin olup olmad�g�n� kontrol eder 
		// varsa true yoks false return eder
		String str1 ="karakartal";
		str1.contains("m");
		System.out.println(str1.contains("m")); // false verir , karakartal �n i�in de 'm' yok
		System.out.println(str1.contains("a")); // true
		System.out.println(str1.contains("kar")); // true
	
		// trim() methodu  
		// Strigin �n�ndeki ve sonundaki bo�luklar� siler.
		// ortadaki bo�luklar� silmez.
		
		String str2= "   Ali Can      ";
		System.out.println("trim() kullanmadan �nce :"+str2);
		System.out.println("trim() kullnd�ktan sonra :"+str2.trim());
		
	
		
		// isEmpty() methodu 
		// Stringin i�inde karakter olup olmamas�na bakar yoksa true varsa false verir
		
		String str3="ali";
		System.out.println(str3.isEmpty()); // false
		
		String str4="";
		System.out.println(str4.isEmpty()); // true
		
		String str5=" ";
		System.out.println(str5.isEmpty()); // false   bo�luk var
		
		
		
		
	}

}
