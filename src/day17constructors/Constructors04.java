package day17constructors;

public class Constructors04 {
	
	int num1=12;
	static int num2=22;
	 

	public static void main(String[] args) {
	     //static methot içinde sadece static elemanlar kullanılır  
	//	num1++;   //num1 statik olmadığından main method da kullanılmaz
		num2++;   // num2 static olduğundan sorun yok
	}
//	Kural 1: static ise method ve variable ları class ismiyle cagırabiliriz
//	kural 2: static medholarda static olmayan variable kullanılmaz.
//	kural 3: class daki bir variable staticse o variable da yapılan degisim butun objelerde gecerlidir.(gokdeki ay gibi)
}
 