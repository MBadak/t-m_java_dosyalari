package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		// main methot d���ndakiki bir methodu �a��rd�k
		// parantez i�ersine yaz�lan de�erlere arg�ment denir. de�i�tirdik�e ona g�re yeni de�r bulur
		int t=toplam(7,5);
		int �=�arp�m(11,9);
		System.out.println(t); 
		System.out.println(�);

	}
	//Bu kodun �a�r�labilmesi i�in i�ersinde mutlaka static yaz�lmal�
	//Methot parantezinin i�inde olusturulana varable ye parametre denir
	//Bir methodu main methodun icinden cagirmak icin mutlaka static kelimesini kullanmalisiniz.
	//Method parantezinin icinde olusturulan variable'lara "parametre" denir.
	//Methodu cagirirken method parantezinin icine yazilan degerlere "Argument" denir.
	//Parametrenin data type'i ile Argumentin data type'i 1'e 1 eslesmeli

	
	public static int toplam(int num1,int num2) {
		return num1+num2;
		
	}

	public static int �arp�m(int num1, int num2) {
	          return num1*num2;
	}
}
