package day36collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		// Queue 1) Queue ya eklenen elemanlar en sona eklenir,listlerde oldugu gibi.
		//       2) Queue da silinen elemanlar en bastan silinir.
		//          [1,2,3]  buradan eleman silmeye baslarsaniz önce 1 i siler
		//          FIFO  ==> Frist In Frist Out  ilk gelen ilk cikar 
		
		Queue<String> q = new PriorityQueue<>(); //  Queue interfeice oldugundan Priority class i kullandik
		
		q.add("B");
		q.add("A");
		q.add("C");
		System.out.println(q); //[A, B, C]  PriorityQueue elemanlari dogal siralar
		// remove() methodunu kullanalim
		System.out.println("Silinen eleman : " + q.remove());  // A silinen elemani yazar
		System.out.println("Kalan elemanlar : "+q);			   // [B, C]  kalan elemanlari verir	
		System.out.println(q.remove("C"));					   // True verir islemi yaptim dergibi
		System.out.println("Kalan elemanlar : "+q);
		
		
		Queue<String> qll = new LinkedList<>();
		qll.add("B");
		qll.add("A"); 
		qll.add("C");
		System.out.println(qll);  // [B, A, C]  LinkedList girilen siraya göre yazdirir.
		System.out.println("ilk elemani döndürür :"+ qll.element());  // B ilk eleman
		System.out.println(qll.poll());   // ilk elemani sildi return etti
		
		
		//Not: remove() methodu bos queue'lar icin kullanilirsa Exception verir.
		//     poll() methodu bos queue'lar icin kullanilirsa null verir.
		//     Ama dolu queue'lar icin ayni isi yaparlar, farklari yoktur
		
	}

}
