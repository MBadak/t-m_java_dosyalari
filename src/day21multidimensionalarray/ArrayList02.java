package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// List olusturun ismi list01 olsun
		// Listler data type olarak primitivleri kabul etmez.
		// Primitivlerde data type ni non-primitiv yapmak için Wrapper classlarý
		// kullanýrýz
		// yani int ==> Integer kullanmalýyýz.

		List<Integer> list01 = new ArrayList<>();

		// bu list in içersinde elmaman olup olmadýðýný kontrol edin.
		// isEmpty() methodu kullanýlýr boþ ise True , dolu ise False rutern eder
		list01.isEmpty();
		System.out.println(list01.isEmpty());

		// bu listeye bir eleman ekleyin ve içersinde varmý yok mu diye bakýn

		list01.add(5);
		System.out.println(list01.isEmpty());
		
		// Listen eleman silmek    .remove();  methodu kullanýlýr
		list01.add(123);
		list01.add(23);
		list01.add(123);
		System.out.println(list01); // [5, 123, 23, 123]
		
		list01.remove(1);  // index i 1 olan elemaný siler
		System.out.println(list01); //[5, 23, 123]
		
		// 5 i silin
		list01.remove(0);
		System.out.println(list01); //[ 23, 123]
		
		// liste ki son elemaný silin  .size()
	
		list01.remove(list01.size()-1);
		
		System.out.println(list01); // [23]
		
		
	}

}
