package day08ternaryoperator;

public class TekAndCiftAnd {

	public static void main(String[] args) {
		
	//	System.out.println(3<2 && 5>4);          // end &&  iþleminde bir hata varsa diðerlerine java bakmaz
		
	//	System.out.println(3<2 && 6<5 && 8>8 );  // 3<2 yanlýþ olduðu çin diðerlerini kontrol etmez
		                                         // buna sebeb && kullanmamýzdýr 
		
		System.out.println(3<2 & 6<5 & 8>8 );    // tek & yazarzak sonuç yine aynýdýr 
		                                         // fakat yanlýþtan sonrada diðerlerine tek tek bakar
		                                         // bu da yükü ve süreyi arttýrýr.
		
		
		
		
		
		
		
		

	}

}
