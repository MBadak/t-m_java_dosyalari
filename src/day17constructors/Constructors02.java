package day17constructors;

public class Constructors02 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// b�y�me(33);
		// b�y�me constructors bu class ta de�il hatas� veriyor.
		// e�er siz ba�ka class taki methodu kullanmak istiyorsan�z bir tane obje
		// olusturmal�s�n�z
		//buyume() methodu bu class'da degil Constructors01 class'inda. 
		//O yuzden Java kullanmama musaade etmiyor.
		//Eger siz baska bir class'daki methodu kullanmak istiyorsaniz o class'dan bir tane object
		//olusturup o object sayesinde istediginiz methodu kullanabilirsiniz.


		Constructors01 obj1 = new Constructors01();
		//buyume() methodu static oldugundan Java object kullanarak buyume() methodunu
				//cagirmamizi istemez ve kodun altini sari renkle cizer.
		obj1.b�y�me(33);
		//isimDegistir() methodu static oldugundan Java object kullanarak isimDegistir() methodunu
		//cagirmamizi istemez ve kodun altini sari renkle cizer.
		obj1.isimDe�i�tirme("Hakan");
		System.out.println(obj1.isim);
		System.out.println(obj1.ya�);

		// bir variable veya method static olarak olu�turulmu�sa obje olu�turmadan
		// ula�abilirsiniz
		System.out.println(Constructors03.ad);
		System.out.println(Constructors03.kilo);
		Constructors03.art�rma(45);

	}

}
