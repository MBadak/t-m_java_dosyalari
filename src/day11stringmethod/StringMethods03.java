package day11stringmethod;

public class StringMethods03 {

	public static void main(String[] args) {
         		
		             // concat() methodu
		
		// concatination (birleþtirme) yapmanýn yeni methodu 

		String str1="Ali";
		String str2="Veli";
		
		System.out.println(str1+str2);         //AliVeli
		System.out.println(str1.concat(str2)); // AliVeli
		System.out.println(str1.concat(" ").concat(str2)); //Ali Veli
		
		
		          // replace() methodu
		
		// Bir karakter yerine baþka karekter yazdýrýr.
		// ata yerine ana yazmak istiyorsunuz
		
		
		         // replace 1 version
		String str3= "ata";
		
		System.out.println(str3.replace("t", "n"));  //ana
		System.out.println(str3.replace("a", "ü"));  // ütü
		System.out.println(str3.replace("x", "y"));  // ata    x yok deðiþim olmaz
		System.out.println(str3.replace("", "/"));  // /a/t/a/  hiçbirþeye / yazar
		System.out.println(str3.replace("t", ""));  //aa  t yerine hiçbirþey yap
		System.out.println(str3.replace("at", "Mustaf"));  //Mustafa
		
	        	 // replaceFirst() version
	// deðiþtirmek istediðimiz karakterin sadece ilk görünümünü deðiþtirir.

		String str4="karakartal";
		System.out.println(str4.replaceFirst("k", "K"));  // Karakartal sadece ilk k yý K yapar
		System.out.println(str4.replaceFirst("a", "e"));  // kerakartal sadece ilk a yý e ye dönüþtürür
		System.out.println(str4.replaceFirst("a", "e").replaceFirst("k", "K"));  //Kerakartal
		System.out.println(str4.replaceFirst("kar", "").replaceFirst("a", "A"));  //Akartal
	
	
	
	
	
	
	}

}
