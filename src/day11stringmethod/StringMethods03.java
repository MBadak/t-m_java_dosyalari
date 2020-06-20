package day11stringmethod;

public class StringMethods03 {

	public static void main(String[] args) {
         		
		             // concat() methodu
		
		// concatination (birle�tirme) yapman�n yeni methodu 

		String str1="Ali";
		String str2="Veli";
		
		System.out.println(str1+str2);         //AliVeli
		System.out.println(str1.concat(str2)); // AliVeli
		System.out.println(str1.concat(" ").concat(str2)); //Ali Veli
		
		
		          // replace() methodu
		
		// Bir karakter yerine ba�ka karekter yazd�r�r.
		// ata yerine ana yazmak istiyorsunuz
		
		
		         // replace 1 version
		String str3= "ata";
		
		System.out.println(str3.replace("t", "n"));  //ana
		System.out.println(str3.replace("a", "�"));  // �t�
		System.out.println(str3.replace("x", "y"));  // ata    x yok de�i�im olmaz
		System.out.println(str3.replace("", "/"));  // /a/t/a/  hi�bir�eye / yazar
		System.out.println(str3.replace("t", ""));  //aa  t yerine hi�bir�ey yap
		System.out.println(str3.replace("at", "Mustaf"));  //Mustafa
		
	        	 // replaceFirst() version
	// de�i�tirmek istedi�imiz karakterin sadece ilk g�r�n�m�n� de�i�tirir.

		String str4="karakartal";
		System.out.println(str4.replaceFirst("k", "K"));  // Karakartal sadece ilk k y� K yapar
		System.out.println(str4.replaceFirst("a", "e"));  // kerakartal sadece ilk a y� e ye d�n��t�r�r
		System.out.println(str4.replaceFirst("a", "e").replaceFirst("k", "K"));  //Kerakartal
		System.out.println(str4.replaceFirst("kar", "").replaceFirst("a", "A"));  //Akartal
	
	
	
	
	
	
	}

}
