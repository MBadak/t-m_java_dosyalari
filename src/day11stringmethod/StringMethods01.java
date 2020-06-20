package day11stringmethod;

public class StringMethods01 {

	public static void main(String[] args) {
		           // 1 // startsWith() methodu
		
		//bir stringin istenen harfle ba�lay�p ba�lamad���n� kontrol eder
		// istenenle ba�larsa  True  de�ilse False verir
		 
	String str1="Ali Can";
	
		          //  startsWith () 1. version
		
		System.out.println((str1.startsWith("A")));  // true
		System.out.println((str1.startsWith("C")));  //false
		System.out.println((str1.startsWith("a")));  // false   b�y�k k���k farkeder
		
		System.out.println((str1.startsWith("Al"))); //true  sadece harf de�il kelimeyede bakabilir
		
		          //  startsWith () 2. version
		System.out.println(str1.startsWith("a",3));   // false
		                               // 3 indexe gider bakar a ise true degilse false
		System.out.println(str1.startsWith("a",5));   // true
		System.out.println(str1.startsWith("Can",4)); // true
		
		      // 2 // endWith() Methodu
		
		// Bir Stringin istenen harfle bitip bitmedi�ine bakar
		// E�er istenenle biterse True de�ilse False verir
		
		
		String str2="ay�e Canan";
		
		System.out.println(str2.endsWith("n"));       //true
		System.out.println(str2.endsWith("Canan"));   // true
		System.out.println(str2.endsWith("CANAN"));   // false
		
		
		
	}

}
