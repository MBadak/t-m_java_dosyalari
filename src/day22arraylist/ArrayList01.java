package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// equals() methodu iki listtin eþit olup olmadýðýný kontrol eder.
		// eþit ise true deðilse false

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();

		System.out.println(list1.equals(list2)); // true

		list1.add("A"); // eleman ekledik

		System.out.println(list1.equals(list2)); // False

		list2.add("A"); // list2 de ayný elemaný verdik
		System.out.println(list1.equals(list2)); // true

		list1.add("b");
		list1.add("c");

		list2.add("c");
		list2.add("b");
		System.out.println(list1.equals(list2));// False elemanlar ayný ama sýralanýþ(index) farklý.

	}

}
