package day35collectıons;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods01 {

	public static void main(String[] args) {
	List<String> list1 = new ArrayList<>();
	list1.add("A");
	list1.add("B");
	list1.add("C");
	System.out.println(list1);
	 
	// listitteretor olusturalim (neden : list1 deki elemanlarla oynamak veya degistirmek icin mecburuz)
	
	ListIterator<String> listIterator = list1.listIterator();
	
	while (listIterator.hasNext()) {
		Object element= listIterator.next();
		System.out.print(element +" ");
	}
	System.out.println();
	
	//hasPrevious() ve previous() methodlarini kullanarak
	//bir listin elemanlarini tersten yazdirmak isterseniz mutlaka
	//once hasNext() ve next() kullanmalisiniz
	while(listIterator.hasPrevious()) {
		Object element = listIterator.previous();
		System.out.print(element + " ");		
	}
}
}