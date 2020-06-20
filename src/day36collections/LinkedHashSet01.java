package day36collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSet01 {

	public static void main(String[] args) {
		// LinkedHashSet: 1) Duplication'a izin vermez, key-value yapisi var
		//                2) Elemanlari programcinin girdigi siraya gore dizer.

		LinkedHashSet<String> lhSet = new LinkedHashSet<>();
		
		lhSet.add("Z");
		lhSet.add("A");
		lhSet.add("D");
		lhSet.add("B");
		System.out.println(lhSet); // [Z, A, D, B] kullanicinin girdigi siraya göre dizer
		
		LinkedHashSet<Integer> lhSet1 = new LinkedHashSet<>();
		
		lhSet1.add(6);
		lhSet1.add(3);
		lhSet1.add(0);
		lhSet1.add(4);
		System.out.println(lhSet1);  // [6, 3, 0, 4]
		

		
		TreeSet<Integer> tSet = new TreeSet<Integer>(lhSet1);   // [0, 3, 4, 6]  siraladik
		System.out.println(tSet);
		
	}

}
