package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// List olusturun ismi list01 olsun
		// Listler data type olarak primitivleri kabul etmez.
		// Primitivlerde data type ni non-primitiv yapmak i�in Wrapper classlar�
		// kullan�r�z
		// yani int ==> Integer kullanmal�y�z.

		List<Integer> list01 = new ArrayList<>();

		// bu list in i�ersinde elmaman olup olmad���n� kontrol edin.
		// isEmpty() methodu kullan�l�r bo� ise True , dolu ise False rutern eder
		list01.isEmpty();
		System.out.println(list01.isEmpty());

		// bu listeye bir eleman ekleyin ve i�ersinde varm� yok mu diye bak�n

		list01.add(5);
		System.out.println(list01.isEmpty());
		
		// Listen eleman silmek    .remove();  methodu kullan�l�r
		list01.add(123);
		list01.add(23);
		list01.add(123);
		System.out.println(list01); // [5, 123, 23, 123]
		
		list01.remove(1);  // index i 1 olan eleman� siler
		System.out.println(list01); //[5, 23, 123]
		
		// 5 i silin
		list01.remove(0);
		System.out.println(list01); //[ 23, 123]
		
		// liste ki son eleman� silin  .size()
	
		list01.remove(list01.size()-1);
		
		System.out.println(list01); // [23]
		
		
	}

}
