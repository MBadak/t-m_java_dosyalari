package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
 // ["A","C","B","C"] olu�turun
		List<String> list=new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("C");
		
		System.out.println(list);  // [A, C, B, C]
		
		// liste "B" varm�?  .contains();   methodu bunu verir..	
		
		System.out.println(list.contains("B"));// true // varsa true yoksa false

		System.out.println(list.contains("z")); // false    yok
		
		// list teki elemanlar� alfabetik s�raya koyunuz.  
		// Collection ==> bir araya getiren demek koleksiyon once bunu yap�yoruz sorada   .sort(); kullan�yoruz
		
		Collections.sort(list);  // bir araya getirdi ve alfabetik s�raya soktu.
		System.out.println(list);// [A, B, C, C]
		
		
		
	}

}
