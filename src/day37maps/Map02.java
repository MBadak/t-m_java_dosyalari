package day37maps;

import java.util.Hashtable;

public class Map02 {

	public static void main(String[] args) {
		/* HashTable : HashMap ile hemen hemen aynidir
		 *           1)HashTable key-value lerde null a müsade etmez
		 *           2)Baska yerlerde iki defa calisabilir
		 */
		Hashtable<String,String> hTable = new Hashtable<>();
		
		hTable.put("Dil", "Kalp");
		hTable.put("Gonul", "Kalp");
		hTable.put("Dil", "Tat alma organi"); // dil 2 sefer girildi en son olani kullandi.
	//	hTable.put(null, "Agizlik");    // run time eror verir nul eklenmez
	//	hTable.put("kanaat", null);     // run time eror verir nul eklenmez
		System.out.println(hTable);
		

	}

}
