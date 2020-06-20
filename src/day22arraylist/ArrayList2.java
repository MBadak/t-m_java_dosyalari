package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		// toArrays() methodu bir listi array'e �evirmeye yarar.
		
		List<String> list=new ArrayList<String>();
		list.add("Ali");
		list.add("Can");
		System.out.println(list);
		//1 .yol
		String arr[] =list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		
		//2. yol
		Object arr1[]=list.toArray();
		
		System.out.println(Arrays.toString(arr1));
		
		//  asList() methodu Arrays�  Liste d�n��t�r�r.
		
		String arr2[]= {"Aliye","Canan"};
	
		// Arrays.asList(arr2);  b�ylr �evrilir fakat havada , liste atayal�m,
		
		List<String> list1 =	Arrays.asList(arr2);
		
		System.out.println(list1);
		
		// Array den  Liste �evirme yaparsan�z elde edilen List uzunluk olarak esmnek de�ildir.
		// yani yeni olu�an Liste ekleme ve ��karma yapamazs�n�z
		
		
	}
}
