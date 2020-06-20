package day17constructors;

public class Constructors04 {
	
	int num1=12;
	static int num2=22;
	 

	public static void main(String[] args) {
	     //static methot içinde sadece static elemanlar kullanýlýr  
	//	num1++;   //num1 statik olmadýðýndan main method da kullanýlmaz
		num2++;   // num2 static olduðundan sorun yok
	}
//	Kural 1: static ise method ve variable larý class ismiyle cagýrabiliriz
//	kural 2: static medholarda static olmayan variable kullanýlmaz.
//	kural 3: class daki bir variable staticse o variable da yapýlan degisim butun objelerde gecerlidir.(gokdeki ay gibi)
}
 