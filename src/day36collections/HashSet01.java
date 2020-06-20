package day36collections;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
		// HashSet 1) tekrarli eleman kullanimina izin vermez
		//         2) Key -Value yapisini kullanir  
		// unic numara: herkesin essiz bir numarasi var. mesela univeriste numarasi~9017004   90(yil)17(bolum)004(kazanma sirasi)
		// console de cikan referanslar javanin hashing yontemi  buna hashcode denir.
		// java degerleri bulabilmek icin bunu yapar. javadan datayi istedigimde java kodu bulur sonra datayi bize verir.
		// normalde Key ler her zaman unic dir. Value ler bazen Unic olur bazen olmaz.
		// hashSet icin Key lerde unic dir Value lerde
		// ama listler icin Keyler unic Value lar degildir.
		// class a bagli yani
		
		HashSet<String> hSet=new HashSet<>();
		hSet.add("Apple");
		hSet.add("Mango");
		hSet.add("Manga");
		hSet.add("Grape");
		hSet.add("Orange");
		hSet.add("Fig");
		System.out.println(hSet); //[Apple, Fig, Grape, Mango, Orange]  burada siralama degisti
								  // HashSet ler elemanlarai ekrana rastgele yazdirir. kural yoktur
		hSet.add("Apple");
		hSet.add("Apple");		// degismiyor üzerine yaziyor hata vermiyor
		hSet.add("Apple");

		
		System.out.println(hSet); // [Apple, Fig, Grape, Mango, Orange, Manga]   
	
	
	
	}

}
