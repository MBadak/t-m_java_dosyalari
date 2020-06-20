package day29polymorphismexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class Exceptions02 {
	//Checked Exception’lari (Compile Time Exception) handle etmek icin iki yol var;
		//birincisi “throws” keyword’unu kullanmak. Bunu kullanirsaniz console’da teknik mesajlar
		//gorursunuz. Bu yuzden cok tercih edilmez.
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException  {
		
			@SuppressWarnings("unused")
			FileInputStream file= new FileInputStream("C:/ogrenci.txt");
			
					
		
		}

	}
// Checked Exception'lari (Compile Time Exception) handle etmek icin,
// Ikinci yol olan (Surround with try/catch) kullaniriz.
// bunu kullanirsaniz teknik mesaj yerine kendi yazdiginiz mesaji okursunuz

class ExceptionTryCatch {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			FileInputStream file= new FileInputStream("C:/ogrenci.txt");
		} catch (FileNotFoundException e) {
			System.out.println("dosya bulunamadi Allah bilir kim sildi");
		}
		
	}
}

