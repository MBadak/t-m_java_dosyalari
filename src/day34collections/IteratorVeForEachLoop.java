package day34collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorVeForEachLoop {

	public static void main(String[] args) {
		List<String> list1= new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);
		
		Iterator<String> iterator = list1.iterator();
					//  hasNext() bir sonrasinda eleman varmi diye kontrol eder
//		while (iterator.hasNext()) {
//			System.out.print(iterator.next());
//		}						 	//next() sonraki elemani demek , böylece yazacak
		
		System.out.println("");
		// for each kullanarak elemanlari ekrana yadiralim
		
		
		for (String w : list1) {
			System.out.print(w);
		}
		System.out.println();
		// iterator ile foreach mothodu farki
		
		//Iterator ile for-each loop farki:
				//for-each loop elemanlar arasinda gecer ama collection'i degistiremez
				//iterator ise elemanlar arasinda gezer ve collection'i degistirebilir
				//for-each loop ile degisim yapmaya calisalim degisim olmaz

		while (iterator.hasNext()) {
			iterator.next();
			iterator.remove();   //remove(); methodu eleman silir
		}	
		System.out.println(list1);  // []
	}

}
