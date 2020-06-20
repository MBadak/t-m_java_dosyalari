package day18statickeyword;

public class Static01 {

	static int en = 12;
	static int boy = 10;
	static int alan; // eðer bir varible deðerini oluþturuken hesapyapmak gerekirse.
	static double pi; // "static block " oluþturmak ve içersine yazmak daha iyidir
						// static { } bu þekilde açýlýr.
						// static block veriallere deðer atamak içinde kullanýlýr
						// static block class ýn içersinde diðerlerinin dýþýnda oluþturulur.
						// en baþta static block çalýþýr. birden fazla ise üsten baþlar
	static {

		pi = 3.14;
	}
	static {
		alan = en * boy; // hata almamak için stattik varible kullan
	}

	public static void main(String[] args) {
		System.out.println(pi);
	}
	
	// static class da oluþturulabilir . fakat ancak alt class larda oluþturulabilir
	// alt (inner)  class ,üst (outer) class ýn body si içersinde oluþur
	
	static class AltClass {
		// bu bir alt classtýr.
	}
	
}
