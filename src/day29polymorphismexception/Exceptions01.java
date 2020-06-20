package day29polymorphismexception;

public class Exceptions01 {

	public static void main(String[] args) {
		// Exceptions ==> problem olan istisnai durum
		//kendimiz cözulebilir isek handling exception denir ==>lastik patlamasi  lastigi degistirebiliriz.
		//kendimiz cözulemez isek throwing exception  denir  ==> aslan saldirmasi aslan icin yardim talap ederiz.
		// Exception: problemli istisnai bir durum
		// hadding exception: kendimin çözebildiði problemler
		// throwing exception: kendi baþýma (yardýmsýz) çözemeyeceðim problemler
		// Exception'lar 2 türlüdür run time ve compile time error
		// compile time exception'lara checked exception da denir
		// checked exception'lar mutlaka düzeltilip devam edilmeli
		
		// mutlaka bilinmesi gereken check exception'lar
		// 1) FileNotFoundException: programýmam dýþarýdan dosya almak istediðimde dosyanýn bulunamadýðý zaman veren hata
		// 2) IOException: input output exception: programýn içine bilgi alma veya programdan dýþarýya bilgi aktarma durumlarýnda oluþan hata

		// Checked Exception'lar iki türlü handle edilir:
			// 1*) throws yazmak: javaya: "problem varsa yardým iste demektir."
			// 2-)try-catch blocks. try: dene, catch= yakala demketir.
			// 3-) dene- hata cýkarsa -yakala-yapamazsan-bana mesaj at. readable dýr.
			//aradaki fark: try catch önce dener. olmazsa mesaj atar.
			//ama trow da hazýr mesajlarý ekrana atar problem hakkýnda. ama ayrýntý ve hatanýn yerini sözleyen bir mesaj yazabilirz. bu yüzden readable dir
	}

}
