package day17constructors;

public class Constructors02 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// büyüme(33);
		// büyüme constructors bu class ta deðil hatasý veriyor.
		// eðer siz baþka class taki methodu kullanmak istiyorsanýz bir tane obje
		// olusturmalýsýnýz
		//buyume() methodu bu class'da degil Constructors01 class'inda. 
		//O yuzden Java kullanmama musaade etmiyor.
		//Eger siz baska bir class'daki methodu kullanmak istiyorsaniz o class'dan bir tane object
		//olusturup o object sayesinde istediginiz methodu kullanabilirsiniz.


		Constructors01 obj1 = new Constructors01();
		//buyume() methodu static oldugundan Java object kullanarak buyume() methodunu
				//cagirmamizi istemez ve kodun altini sari renkle cizer.
		obj1.büyüme(33);
		//isimDegistir() methodu static oldugundan Java object kullanarak isimDegistir() methodunu
		//cagirmamizi istemez ve kodun altini sari renkle cizer.
		obj1.isimDeðiþtirme("Hakan");
		System.out.println(obj1.isim);
		System.out.println(obj1.yaþ);

		// bir variable veya method static olarak oluþturulmuþsa obje oluþturmadan
		// ulaþabilirsiniz
		System.out.println(Constructors03.ad);
		System.out.println(Constructors03.kilo);
		Constructors03.artýrma(45);

	}

}
