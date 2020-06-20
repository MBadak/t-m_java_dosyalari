package day37maps;

import java.util.TreeMap;

public class Map03 {

	public static void main(String[] args) {
		/*TreeMap :1) TreeMap key lerde null kulanmaya musade etmez
		 *         2) TreeMap Value lerde null kulanmaya musade eder.
		 *         3) Ne zaman tree duyarsani siralama yapacagi aklimiza gelsin. Natural order siralama
		 *         4) Siralamayi keylere göre yapar.
		 *         5) en yavas map dir. cünkü extra siralama isi yapar.
		 */

		TreeMap<String, Integer> tMap = new TreeMap<>();
		
		tMap.put("kanaat", null);
		tMap.put("bezelye", 7);
		tMap.put("Elma", 10);
		tMap.put("Armut", 8);
		System.out.println(tMap);   // {Armut=8, Elma=10, bezelye=7, kanaat=null}  siraldi

		
		
		
	}

}
