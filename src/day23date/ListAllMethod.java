package day23date;

import java.util.ArrayList;
import java.util.List;

public class ListAllMethod {

	public static void main(String[] args) {
		// listAll()  methodu iki listi birleştirmek için kullanılır
		List<Integer> list1= new ArrayList<>();
		list1.add(11);
		list1.add(12);
		System.out.println(list1);//[11, 12]
		
		List<Integer> list2= new ArrayList<Integer>();
		list2.add(13);
		list2.add(14);
		list2.add(15);
		System.out.println(list2);//[13, 14, 15]

		list1.addAll(list2);
		System.out.println(list1); //[11, 12, 13, 14, 15]
		
		list2.addAll(list1); 
		System.out.println(list2); // [13, 14, 15, 11, 12, 13, 14, 15]
		
		System.out.println("*************** yeni list oluştur **************************************");
		
		List<Integer> list3= new ArrayList<Integer>();
		list3.add(100);
		System.out.println(list3);
		
		
		List<Integer> list4= new ArrayList<Integer>();
		list4.add(2);
		list4.add(3);
		System.out.println(list4);
		list4.addAll(1, list3);     // ibdex li addAll(1,list)   1 yerleşecek index demek
		System.out.println(list4);
	}

}
