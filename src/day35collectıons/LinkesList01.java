package day35collectıons;

import java.util.LinkedList;

public class LinkesList01 {

	public static void main(String[] args) {
		// olusturacagimiz listen sürekli eleman eklemek ve cikartmak yapacaksak Linkedlist kullanuiriz 
		//cünkü tek tek aramaz direk elemana gider java yorulmaz
		
		// Linked list'de head haric her eleman icin bir data bir de pointer var.
		// head'de sadece pointer var.
		// Her elemanin pointer'i bir sonraki elemani gosterir, son eleman'in(tail)
		// pointer'i Null gosterir.
		// Data ve pointer iceren her elemanin diger adi "Node" dur.
		// Linked list eleman ekleme ve cikarma durumlarinda basarilidir.

		
		
		LinkedList<String> linkedList =new LinkedList<>();
		
		linkedList.add("Mark");
		linkedList.add("Amanda");
		linkedList.add("John");
		linkedList.add("Ann");
		linkedList.add("Pemela");
	
		System.out.println(linkedList);   // [Mark, Amanda, John, Ann, Pemela]

		linkedList.remove(2);             // remove (2)  2 . index deki eleman siliniyor [Mark, Amanda, Ann, Pemela]  john gitti
		
		System.out.println(linkedList); 
		
		linkedList.removeFirst();         //  .removeFirst();  ilk elemani siler  [Amanda, Ann, Pemela]  mark gitti
		
		System.out.println(linkedList); 
		
		linkedList.removeLast();         //  removeLast();   son elemani siler  [Amanda, Ann]  Pemela gitti

		System.out.println(linkedList); 
		
		linkedList.add(1, "Ali");       //  add(1, "Ali");   1 index e Ali yi ekler  [Amanda, Ali, Ann]
		System.out.println(linkedList); 
		
		linkedList.set(1, "Ajanda");    // .set(1, "Ajanda");  1 indexdekini Ajanda ya dönüstürdü
		System.out.println(linkedList); 
		
		LinkedList<String> linkedList2 =new LinkedList<>();
		linkedList2.add("X");
		linkedList2.add("Y");
		
		linkedList.addAll(linkedList2);   // .addAll(linkedList2)    linkedlist2   komple ekledi  [Amanda, Ajanda, Ann, X, Y]
		System.out.println(linkedList); 
		
		linkedList.addAll(2,linkedList2); // addAll(2,linkedList2)   son linklist e   linkedlist2 yi  2 . index e ekler
		
		System.out.println(linkedList); 
		
		linkedList2.contains("Can");  
		System.out.println(linkedList2.contains("Can")); // .contains("Can"); can varmi ?  false
		System.out.println(linkedList2.contains("X"));  // x varmi       true
		
		linkedList2.clear();                  //   .clear();  listdeki elemanlari siler bos bir list kalir
		System.out.println(linkedList2);      //    []
		
		
		
		
		
	}

}
