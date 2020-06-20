package day29polymorphismexception;

public class Exceptions01 {

	public static void main(String[] args) {
		// Exceptions ==> problem olan istisnai durum
		//kendimiz c�zulebilir isek handling exception denir ==>lastik patlamasi  lastigi degistirebiliriz.
		//kendimiz c�zulemez isek throwing exception  denir  ==> aslan saldirmasi aslan icin yardim talap ederiz.
		// Exception: problemli istisnai bir durum
		// hadding exception: kendimin ��zebildi�i problemler
		// throwing exception: kendi ba��ma (yard�ms�z) ��zemeyece�im problemler
		// Exception'lar 2 t�rl�d�r run time ve compile time error
		// compile time exception'lara checked exception da denir
		// checked exception'lar mutlaka d�zeltilip devam edilmeli
		
		// mutlaka bilinmesi gereken check exception'lar
		// 1) FileNotFoundException: program�mam d��ar�dan dosya almak istedi�imde dosyan�n bulunamad��� zaman veren hata
		// 2) IOException: input output exception: program�n i�ine bilgi alma veya programdan d��ar�ya bilgi aktarma durumlar�nda olu�an hata

		// Checked Exception'lar iki t�rl� handle edilir:
			// 1*) throws yazmak: javaya: "problem varsa yard�m iste demektir."
			// 2-)try-catch blocks. try: dene, catch= yakala demketir.
			// 3-) dene- hata c�karsa -yakala-yapamazsan-bana mesaj at. readable d�r.
			//aradaki fark: try catch �nce dener. olmazsa mesaj atar.
			//ama trow da haz�r mesajlar� ekrana atar problem hakk�nda. ama ayr�nt� ve hatan�n yerini s�zleyen bir mesaj yazabilirz. bu y�zden readable dir
	}

}
