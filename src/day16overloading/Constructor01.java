package day16overloading;

public class Constructor01 {
	
	int fiyat= 20000;
	int y�l=2020;
	String model= "Honda";
	String type= "Civic";
	
	
	public static void main(String[] args) {
		
		//Class olusturdugumuzda Java classla beraber bir constructor olusturur, biz onu 
		//herhangi bir kod yazmadan direkt kullanabiliriz. Bu constructor'a "default constructor" denir.
		//Default constructor'larda parametre olmaz.
		//Default constructor class olusturuldugu anda Java tarafindan olusturulur.
		//Biz kendimiz bir constructor olusturdugumuzda Java default constructor'i imha eder.

		
		Constructor01 hondaAraba = new Constructor01();  // Scanner gibi ... obje �retiyoruz.
		
		System.out.println(hondaAraba.model);
		System.out.println(hondaAraba.type);
		System.out.println(hondaAraba.y�l);
		System.out.println(hondaAraba.fiyat);
		
		
	}

}
