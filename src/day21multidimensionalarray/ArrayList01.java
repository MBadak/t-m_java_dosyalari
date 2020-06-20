package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * Array lerde lengt sabittir. ArrayListe siz eleman ekledikçe List lengh tini
		 * artýrýr. siz eleman sildikçe azaltýr
		 */

		int arr[] = { 1, 2, 3 };
		List<String> list01 = new ArrayList<>();
		
//veya ArrayList<String> list01= new  ArrayList<>();
//		List<String> list01= new  List<>();    bu olmaz
		System.out.println(list01); // ekrana yazdýrmak için sadece isimi yeterli. sonuç içi boþ []

		// Liste eleman eklemek içim add() methodu kullanýlýr
		list01.add("Can");
		System.out.println(list01);
		list01.add("Ali");
		System.out.println(list01); // önce eklenenei öne koyar [Can, Ali]
// veli yi Ali ile Can arasýna koyalým
		list01.add(1, "Veli"); // buradaki 1 index dir hangi index e koyacaksak onu yazarýz
							   // add(index,parametre)
		System.out.println(list01); // [Can, Veli, Ali]

		// [Han ,Can, Kemal, ,veli ,Ali , Aysel ] þekline getiriniz
		list01.add(0, "Han");
		System.out.println(list01);
		list01.add(2, "Kemal");
		System.out.println(list01);
		list01.add("Aysel");
		System.out.println(list01);
		
		
		// list01 in eleman sayýsýný ekran ayazýnýz
		list01.size();    // .size();  bunu verir
        System.out.print("Eleman sayýsý : ");
		System.out.println(list01.size());  // 6
		
		
		
	}

}
