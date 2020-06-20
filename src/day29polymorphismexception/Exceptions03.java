package day29polymorphismexception;

public class Exceptions03 {

	public static void main(String[] args) {
		// bolme islemi yapan program yapalim
		int num1 =12;
		int num2 =0;
				
		try {
		System.out.println(num1/num2 );
		} catch (ArithmeticException e) {
			System.out.println("0 ile bölme yapilamaz");
		}
		catch (Exception e) {
			System.out.println("0 ile bölme yapilamaz");
		}
		
		//ArithmeticException Run time dir matematik kurallarina uygun degilse ArithmeticException verir
		// try dan sonra birden fazlar catch  kullanilabilir
		
		//ArithmeticException Run Time Exception'dir. Matematik kurallarina uygun olmayan bir 
		//islem yapildiginda bu exception alinir.
				
		//try'dan sonra 1'den fazla catch kullanilabilir.Ama ustteki catch alttaki 
		//catch'in child'i olmalidir. catch'leri Specific'den Genel'e dogru dizmelisiniz

	}

}
