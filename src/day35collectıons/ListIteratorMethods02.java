package day35collectıons;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {

	public static void main(String[] args) {
		//Elemanlari A B C olan list olustur
		//ListIteratot kullanarak AW BW CW  ye dönüstur


		List<String> list =new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		ListIterator<String> listIt= list.listIterator();
		while ( listIt.hasNext()) {
			Object ters = listIt.next();
			listIt.set(ters + "W ");
			
		}
		System.out.println(list);
		
		listIt.add("Ali");
		listIt.add("kemal");
		
		System.out.print(list);
				
	}

}
