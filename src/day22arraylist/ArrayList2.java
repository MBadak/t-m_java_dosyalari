package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		// toArrays() methodu bir listi array'e çevirmeye yarar.
		
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
		
		//  asList() methodu Arraysý  Liste dönüþtürür.
		
		String arr2[]= {"Aliye","Canan"};
	
		// Arrays.asList(arr2);  böylr çevrilir fakat havada , liste atayalým,
		
		List<String> list1 =	Arrays.asList(arr2);
		
		System.out.println(list1);
		
		// Array den  Liste çevirme yaparsanýz elde edilen List uzunluk olarak esmnek deðildir.
		// yani yeni oluþan Liste ekleme ve çýkarma yapamazsýnýz
		
		
	}
}
