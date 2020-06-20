package day26encapsulation;



public class Encapsulation01 {
	// instanse varable olusturalim
	private String kimlikNo="34212367512";
	private int krediKartNo=12345678;	
	private boolean soguk=true;
	
	
	public static void main(String[] args) {
	//encapsualtion data saklama (data-hiding) yontemidir
	// bizprogram yazarken bazi seyleri saklariz bunlar icin en capsulation kullaniriz.
	// baskalari kodu degistirip koduncokmesini engellemek icin
	//saklamamiz iyidir fakat ualsilabilir olmalidir.
		//Nasil yapilir
	// iki adimda yapilir
	//1 ) Datayi (varable ,methot) 	pravite yapmalisiniz.
	//2 ) public olan getter()  ve setter() olan methotlar uretmeliyim		
	//getter()   datayi okumamiza yarar. okur ama degistiremez.
	//setter()   datayi degistirmemize yarar
	
			
	}//getter() uretmek icin; 1) Access Modifier public olmali
	//                       2) Return type variable'in return type'i ile ayni olmali
	//                       3) Method ismi "get + variable ismi" seklinde olmali
	
	// yeni methot olusturuyoruz
	
	public String getKimlikNo() {
  //public olmali   get ile baslamali		         
	return kimlikNo;	
	}
	public  int getKrediKartNo() {
		return krediKartNo;
	}
	// return type  boolean ise ismi  "is"  ile baslar
	public boolean isSoguk() {
		return soguk;
	}
    // data type void olmali 
	// ismi set ile baslamali
	//setter() uretmek icin; 1)Access Modifier public olmali
		//                       2)Return type void olmali
		//                       3)Method ismi "set + variable ismi" seklinde olmali
		//                       4)Parametre kullanilmali (%99)
		//                       5)setter() methodlarin ismi boolean'lar icin de "set" ile baslar
	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo=kimlikNo;
	}
	public void setKrediKartNo(int krediKartNo) {
		this.krediKartNo=krediKartNo;
	}
	public void setSoguk(boolean soguk) {
		this.soguk=soguk;
	}
}
