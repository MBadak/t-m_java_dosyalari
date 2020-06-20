package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		// main methot dýþýndakiki bir methodu çaðýrdýk
		// parantez içersine yazýlan deðerlere argüment denir. deðiþtirdikçe ona göre yeni deðr bulur
		int t=toplam(7,5);
		int ç=çarpým(11,9);
		System.out.println(t); 
		System.out.println(ç);

	}
	//Bu kodun çaðrýlabilmesi için içersinde mutlaka static yazýlmalý
	//Methot parantezinin içinde olusturulana varable ye parametre denir
	//Bir methodu main methodun icinden cagirmak icin mutlaka static kelimesini kullanmalisiniz.
	//Method parantezinin icinde olusturulan variable'lara "parametre" denir.
	//Methodu cagirirken method parantezinin icine yazilan degerlere "Argument" denir.
	//Parametrenin data type'i ile Argumentin data type'i 1'e 1 eslesmeli

	
	public static int toplam(int num1,int num2) {
		return num1+num2;
		
	}

	public static int çarpým(int num1, int num2) {
	          return num1*num2;
	}
}
