package day37collections;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {

	public static void main(String[] args) {
		// Deque : 1) Deuble Ended Queue (iki uclu queue)
		//         2)queue larda ekleme sona silme basta yapilir.
		//         3)Dequeue kullanirsaniz hem bastan silier hem sondan siler ,
		//         4)Dequeue kullanirsaniz hem bastan ekler hem sondan ekler.
		//         5)deque de fifo var ve bunun yaninda Lifo  da var. 
		//           önce girieni once gittigi gibi sonra eklenenide silebilirsiniz
		//           Queue larda eleman olarak null eklenebilirama Deque lara null eleman eklenemez.
		
		Deque<String> dq = new LinkedList<String>();
		dq.add("son 1");
		dq.addFirst("bas 1");
		dq.addLast("son 2");
		dq.push("bas 2");
		dq.offer("son3");
		System.out.println(dq);
		
		// pop() methodu Deque larda bastaki elemani siler  ve sildigi elemani dödürür.
		
		System.out.println(dq.poll());
		System.out.println(dq);     //[bas 1, son 1, son 2, son3]
		System.out.println(dq.removeLast()); // sondakini sildi ekrana yazdi
		System.out.println(dq);    //[bas 1, son 1, son 2]
		System.out.println(dq.removeFirst());  // ilk elemani siler
		System.out.println(dq);  
	}

}
		