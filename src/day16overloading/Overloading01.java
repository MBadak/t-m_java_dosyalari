package day16overloading;

public class Overloading01 {

	public static void main(String[] args) {
		// Ýki sayýnýn toplamýný oluþturan bir metot oluþturunuz.

		toplama( 2, 3 );
		toplama( 7 );
		toplama( 3.5, 3 );
		toplama( 3, 5.3 );
	}

	public static void toplama(int num1, int num2) {

		System.out.println(num1 + num2);

	}  // 1) parametre sayýsýný deðiþtirerek ayný isimli methot oluþturulabilir
	public static void toplama(int num1) {

		System.out.println(num1 + num1);
		
	} // 2)  parametredeki data type deðiþtirerek ayný isimli methot oluþturulabilir
	public static void toplama(double num1, int num2) {

		System.out.println(num1 + num2);
	} // FARKLI data type in yerlerini deðiþtirerek ayný isimli methot oluþturulabilir
	public static void toplama(int num2,double num1 ) {

		System.out.println(num1 + num2);
		//Methodun body kismini degistirmek yeterli olmadi
		//Overloading yapma yollari:
		//1)Parametrelerin sayisini degistirerek ayni isimli method'lar olusturabilirsiniz.
		//2)Parametre sayisini degistirmeden herhangi bir parametrenin data type'ini 
		//  degistirerek de ayni isimli methodlar olusturabilirsiniz.
		//Note: toplama(2,3); cagrisi toplama(int num1, int num2) var oldugu surece 
		//      toplama(int num1, int num2) yi kullanir, cunku argument data type ile parametre 
		//      data type birebir ortusuyor. Fakat birebir ortusen data type yoksa auto widening'e 
		//      gore Java kullanacagi method'u secer. Auto widening'e gore kullanabilecegi bir method
		//      yoksa Java hata verir.
		//3)FARKLI data type'indeki parametrelerin yerlerini degistirerek de ayni isimli
		//  methodlar olusturabilirsiniz.
	}
}
