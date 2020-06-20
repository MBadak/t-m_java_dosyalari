package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
 // ["A","C","B","C"] oluþturun
		List<String> list=new ArrayList<>();
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("C");
		
		System.out.println(list);  // [A, C, B, C]
		
		// liste "B" varmý?  .contains();   methodu bunu verir..	
		
		System.out.println(list.contains("B"));// true // varsa true yoksa false

		System.out.println(list.contains("z")); // false    yok
		
		// list teki elemanlarý alfabetik sýraya koyunuz.  
		// Collection ==> bir araya getiren demek koleksiyon once bunu yapýyoruz sorada   .sort(); kullanýyoruz
		
		Collections.sort(list);  // bir araya getirdi ve alfabetik sýraya soktu.
		System.out.println(list);// [A, B, C, C]
		
		
		
	}

}
