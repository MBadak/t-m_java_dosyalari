package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * Array lerde lengt sabittir. ArrayListe siz eleman ekledik�e List lengh tini
		 * art�r�r. siz eleman sildik�e azalt�r
		 */

		int arr[] = { 1, 2, 3 };
		List<String> list01 = new ArrayList<>();
		
//veya ArrayList<String> list01= new  ArrayList<>();
//		List<String> list01= new  List<>();    bu olmaz
		System.out.println(list01); // ekrana yazd�rmak i�in sadece isimi yeterli. sonu� i�i bo� []

		// Liste eleman eklemek i�im add() methodu kullan�l�r
		list01.add("Can");
		System.out.println(list01);
		list01.add("Ali");
		System.out.println(list01); // �nce eklenenei �ne koyar [Can, Ali]
// veli yi Ali ile Can aras�na koyal�m
		list01.add(1, "Veli"); // buradaki 1 index dir hangi index e koyacaksak onu yazar�z
							   // add(index,parametre)
		System.out.println(list01); // [Can, Veli, Ali]

		// [Han ,Can, Kemal, ,veli ,Ali , Aysel ] �ekline getiriniz
		list01.add(0, "Han");
		System.out.println(list01);
		list01.add(2, "Kemal");
		System.out.println(list01);
		list01.add("Aysel");
		System.out.println(list01);
		
		
		// list01 in eleman say�s�n� ekran ayaz�n�z
		list01.size();    // .size();  bunu verir
        System.out.print("Eleman say�s� : ");
		System.out.println(list01.size());  // 6
		
		
		
	}

}
