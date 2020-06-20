package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		// Ali , Can , Ayþe , ali      den  list oluþturun

		List<String> list=new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ayþe");
		list.add("Ali");
		
		System.out.println(list); // [Ali, Can, Ayþe, Ali]
		
		list.remove("Ali");   // listedeki ilk Ali yi siler dðeri kalýr
		
		System.out.println(list);  // [Can, Ayþe, Ali]
		list.remove("Ali"); 		//Ali yi siler
		System.out.println(list);  // [Can, Ayþe]
		
		list.remove("kemal");  // listede olmayan birþey silmeye çaluþtýk
		System.out.println(list);  // [Can, Ayþe]  aynen kaldý  hata vermedi bir þeyde yapmadý
	
	System.out.println(list.remove(0)); // Can// 0 index deki elemaný silecek , ve hangi elaman ise ou yazacak
	System.out.println(list); // [Ayþe]     sadece bu kaldý
	
	// "Ayþe"  elemanýný "Ayþegül" yapýn.   .set() methodu bunu yapar.
	
	list.set(0, "Ayþegül");   // 0 indextekini deðiþtiriyor yerine Ayþegül yazýyor
	System.out.println(list);
	// list e Kenan ve Zeynep ekleyin
	list.add("Kenan");
	list.add("Zeynep");
	
	System.out.println(list);  // [Ayþegül, Kenan, Zeynep]
	list.clear();            //   .clear();     tamamýný siler
	System.out.println(list);  //[]
	
	
	}

}
