package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		//TreeSet  1) HashSet ile hemen hemen ayni .tekrara müsade etmez key - value  yapiyi kullanir
		//         2) TreeSet elemanlari natural order e göre siralar
		//         3) siralama benim icin önemli olursa TreSet kullanirim  örnek  sözlük
		//         4) TreeSet yavastir cünkü siralama yapar buda yavaslatir
		//         5) Siralama yapilmasi gerekiyor ise hizli olmasi icin önce HashSet olusturularak eleman eklenir 
		//            sonrasinda HashSet TreeSet e dönüstürülür. Hiz problemi halledilir.
		
		TreeSet<String>  tSet= new TreeSet<>();
		tSet.add("ABC");
		tSet.add("String");
		tSet.add("Test");
		tSet.add("Pen");
		tSet.add("Ink");
		tSet.add("Jack");
		System.out.println(tSet); // [ABC, Ink, Jack, Pen, String, Test]  kesinlikle alfabetik siraladi
		
		HashSet<String> hSet1 = new HashSet<>();
		hSet1.add("ABC");
		hSet1.add("String");
		hSet1.add("Test");
		hSet1.add("Pen");
		hSet1.add("Ink");
		hSet1.add("Jack");
		System.out.println(hSet1); // [ABC, Test, Ink, Pen, String, Jack]  rasgele verdi
		
		//Olusturdugumuz HashSet'i TreeSet constructor'ina parametre olarak
				//koyup TreeSet'e ceviririz, boylelikle TreeSet'in elemanlari natural order
				//yapma ozelliginden istifade etmis oluruz.
		TreeSet<String>  tSet1= new TreeSet<>(hSet1); // hSet1 aldik parantez icersine yazdik bu kadar
		
		System.out.println(tSet1);

		
		
	}

}
