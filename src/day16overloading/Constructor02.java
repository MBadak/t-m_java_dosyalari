package day16overloading;

public class Constructor02 {

	public static void main(String[] args) {
		// ba�ka bir class �rettigimiz  Constructor01 den bir obje albiliriz
		// Objenin �zelliklerini de�i�tirebiliriz.
		//1)Baska bir class'dan urettigimiz objecti urettigimiz class'da kullanabiliriz
		//2)Object'in ozelliklerini degistirebiliriz, fakat bu degisim sadece o object ile
		//  sinirli kalir. Yeni uretilecek olan object'ler bu degisimlerden etkilenmez.
		//3)Eger uretilecek her object'in degisime ugramis olmasini istiyorsaniz class'daki ozellikleri
		//  degistirmelisiniz.

		
		
		
		Constructor01 hondaAraba1= new Constructor01();
		
		System.out.println("zaml� fiyat :" + (hondaAraba1.fiyat+1000));
		System.out.println("Model :"+hondaAraba1.model.replace("Honda", "Toyota"));
		System.out.println("type :"+hondaAraba1.type.replace("Civic", "Corolla"));
		System.out.println("y�l :" + (hondaAraba1.y�l-1));
	}

}
