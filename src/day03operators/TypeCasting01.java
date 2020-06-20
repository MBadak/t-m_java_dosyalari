package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {

		byte by = 101;
		int sayý = by; // küçük data tipini büyük data tipine dönüþtürmek için ekstra birþeye gerek yok
						// java otomati deðiþtirir.
		System.out.println(sayý);

		int sayý2 = 53;
		byte by2 = (byte) sayý2; // byte by2 = sayý2; yazdýk hata verdi büyük olaný küçüge atdýn diyor. hata
									// byte by2 = (byte) sayý2; (byte) yazarak biliyorum iþime karýþma deriz.
		System.out.println(by2);

		double say3 = 23.5;
		int by3 = (int) say3;
		System.out.println(by3);

		double sayý5 = 4.8;
		double sayý6 = 1.4;

		double sonuç1 = sayý5 / sayý6;
		System.out.println(sonuç1);

		int sonuç2 = (int) sonuç1;
		System.out.println(sonuç2);

		int sayý7 = 5;
		int sayý8 = 3;

		int sonuç3 = sayý7 / sayý8;
		System.out.println(sonuç3);

		int sayý9 = 255;
		byte by5 = (byte) sayý9;
		System.out.println(by5); // 255 görmeliyiz fakat byte sýnýrý 127 olduðu için -1 gözükür

	}

}
