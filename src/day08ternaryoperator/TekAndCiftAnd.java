package day08ternaryoperator;

public class TekAndCiftAnd {

	public static void main(String[] args) {
		
	//	System.out.println(3<2 && 5>4);          // end &&  i�leminde bir hata varsa di�erlerine java bakmaz
		
	//	System.out.println(3<2 && 6<5 && 8>8 );  // 3<2 yanl�� oldu�u �in di�erlerini kontrol etmez
		                                         // buna sebeb && kullanmam�zd�r 
		
		System.out.println(3<2 & 6<5 & 8>8 );    // tek & yazarzak sonu� yine ayn�d�r 
		                                         // fakat yanl��tan sonrada di�erlerine tek tek bakar
		                                         // bu da y�k� ve s�reyi artt�r�r.
		
		
		
		
		
		
		
		

	}

}
