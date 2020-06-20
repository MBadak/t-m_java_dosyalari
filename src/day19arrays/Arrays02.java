package day19arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// char bir Arrays oluþturun
		// bu Arraye 4 elmanlý olsun
		// bu Arraya eleman yerleþtirn ve for dongüsü ile ekran yazdýrýnýz

		char arr[] = new char[4];

		arr[0] = 'e';
		arr[1] = 'r';
		arr[2] = 'a';
		arr[3] = 'y';

		for (int i = 0; i < 4; i++) {
			System.out.println(arr[i]);

		}
		System.out.println(arr[arr.length-1]);
		 // Array ýn Lengtini bulmak içim "Arrayismi.lengt"  yazmak yeterlidir
		 // Strinlerdede lengt methodu kullanýlý fakat sonuna  () koymak gerekir. burada yok
		
		System.out.println(arr.length); // 4 
		
		
	}

}
