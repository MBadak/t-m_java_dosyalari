package day17constructors;

public class Constructors04 {
	
	int num1=12;
	static int num2=22;
	 

	public static void main(String[] args) {
	     //static methot i�inde sadece static elemanlar kullan�l�r  
	//	num1++;   //num1 statik olmad���ndan main method da kullan�lmaz
		num2++;   // num2 static oldu�undan sorun yok
	}
//	Kural 1: static ise method ve variable lar� class ismiyle cag�rabiliriz
//	kural 2: static medholarda static olmayan variable kullan�lmaz.
//	kural 3: class daki bir variable staticse o variable da yap�lan degisim butun objelerde gecerlidir.(gokdeki ay gibi)
}
 