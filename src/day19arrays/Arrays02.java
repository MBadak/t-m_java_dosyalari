package day19arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// char bir Arrays olu�turun
		// bu Arraye 4 elmanl� olsun
		// bu Arraya eleman yerle�tirn ve for dong�s� ile ekran yazd�r�n�z

		char arr[] = new char[4];

		arr[0] = 'e';
		arr[1] = 'r';
		arr[2] = 'a';
		arr[3] = 'y';

		for (int i = 0; i < 4; i++) {
			System.out.println(arr[i]);

		}
		System.out.println(arr[arr.length-1]);
		 // Array �n Lengtini bulmak i�im "Arrayismi.lengt"  yazmak yeterlidir
		 // Strinlerdede lengt methodu kullan�l� fakat sonuna  () koymak gerekir. burada yok
		
		System.out.println(arr.length); // 4 
		
		
	}

}
