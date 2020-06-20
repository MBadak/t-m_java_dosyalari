package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		// Ali , Can , Ay�e , ali      den  list olu�turun

		List<String> list=new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ay�e");
		list.add("Ali");
		
		System.out.println(list); // [Ali, Can, Ay�e, Ali]
		
		list.remove("Ali");   // listedeki ilk Ali yi siler d�eri kal�r
		
		System.out.println(list);  // [Can, Ay�e, Ali]
		list.remove("Ali"); 		//Ali yi siler
		System.out.println(list);  // [Can, Ay�e]
		
		list.remove("kemal");  // listede olmayan bir�ey silmeye �alu�t�k
		System.out.println(list);  // [Can, Ay�e]  aynen kald�  hata vermedi bir �eyde yapmad�
	
	System.out.println(list.remove(0)); // Can// 0 index deki eleman� silecek , ve hangi elaman ise ou yazacak
	System.out.println(list); // [Ay�e]     sadece bu kald�
	
	// "Ay�e"  eleman�n� "Ay�eg�l" yap�n.   .set() methodu bunu yapar.
	
	list.set(0, "Ay�eg�l");   // 0 indextekini de�i�tiriyor yerine Ay�eg�l yaz�yor
	System.out.println(list);
	// list e Kenan ve Zeynep ekleyin
	list.add("Kenan");
	list.add("Zeynep");
	
	System.out.println(list);  // [Ay�eg�l, Kenan, Zeynep]
	list.clear();            //   .clear();     tamam�n� siler
	System.out.println(list);  //[]
	
	
	}

}
