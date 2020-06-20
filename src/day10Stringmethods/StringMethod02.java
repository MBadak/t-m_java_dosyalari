package day10Stringmethods;

public class StringMethod02 {

	public static void main(String[] args) {
		
		// lastIndexOf() metodu 
		// karakterin enso nerde görüldüðünü verir
		
		// lastIndexOf 1. metod
		
		String str1= "Sivrihisar";
		str1.lastIndexOf('i');
		System.out.println(str1.lastIndexOf('i'));  //6   i harfinin en son yerini verir
		System.out.println(str1.lastIndexOf('r'));  // 9
		
		// lastIndexOf 2. metod
		
		System.out.println(str1.lastIndexOf('i',7)); //6       7. karakterden öcesini arar
		System.out.println(str1.lastIndexOf('i',5)); // 4
		
		// lastIndexOf 3. metod
		
		String str2="rivrihisari";
		System.out.println(str2.lastIndexOf("ri"));
		
		
	}

}
