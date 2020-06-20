package day10Stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
		
		// contains(); methodu 
		// bir Stringin içersinde bir karakterin olup olmadýgýný kontrol eder 
		// varsa true yoks false return eder
		String str1 ="karakartal";
		str1.contains("m");
		System.out.println(str1.contains("m")); // false verir , karakartal ýn için de 'm' yok
		System.out.println(str1.contains("a")); // true
		System.out.println(str1.contains("kar")); // true
	
		// trim() methodu  
		// Strigin önündeki ve sonundaki boþluklarý siler.
		// ortadaki boþluklarý silmez.
		
		String str2= "   Ali Can      ";
		System.out.println("trim() kullanmadan önce :"+str2);
		System.out.println("trim() kullndýktan sonra :"+str2.trim());
		
	
		
		// isEmpty() methodu 
		// Stringin içinde karakter olup olmamasýna bakar yoksa true varsa false verir
		
		String str3="ali";
		System.out.println(str3.isEmpty()); // false
		
		String str4="";
		System.out.println(str4.isEmpty()); // true
		
		String str5=" ";
		System.out.println(str5.isEmpty()); // false   boþluk var
		
		
		
		
	}

}
