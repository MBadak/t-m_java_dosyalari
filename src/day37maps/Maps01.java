package day37maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		// Map bir interface dir 
		// 3 tane child clasi vardir
		
		/*  1) HaShMap : key-Value yapisini kullanir
		 *               kex- value programci tarafindan yazili
		 *               key ve value da null  degeri kullanilabilir
		 *               birden fazla null degeri girilmisse en sondaki degerin üzerine yazar
		 *               HashMap console yazildiginda hem key hemde value degerleri aralarin aesittir degeri vererek yazar
		 *               HashMap rasgele siralar
		 *               HashMap mapler arasinda en hizlidir.
		 *                HashMap’ler “therad safe” değildir. Bazen bir application’da aynı anda iki birlikte çalışır.
		 */
		
		HashMap<Integer,String> hashMap = new HashMap<>();
		hashMap.put(333, "Ali");
		hashMap.put(44, "Veli");
		hashMap.put(25, "Mine");
		System.out.println(hashMap);  //{2555=Mine, 44=Veli, 333=Ali} rasgele siralar
		
		System.out.println(hashMap.remove(44)); 
		System.out.println(hashMap); //{25=Mine, 333=Ali}   veliyi sildi
		System.out.println(hashMap.remove(333, "Ali")); // true 
		
		hashMap.put(44, "Veli"); // mine   25 . key ne? sorusunun cevabi
		System.out.println(hashMap.keySet()); 
		
		System.out.println(hashMap.values()); 
		System.out.println(hashMap.size());      // kac eleman var
		System.out.println(hashMap.containsKey(25));  // 25 de elemannvarmi  true
		hashMap.clear();  // tüm elemanlari siler
		
		
		
		
	}

}
