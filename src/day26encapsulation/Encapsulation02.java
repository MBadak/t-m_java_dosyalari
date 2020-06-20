package day26encapsulation;

public class Encapsulation02 {
	
	private char ilkHarf= 's';
	private double para=23.75;
	private boolean emekli= false;
	
	
	public static void main(String[] args) {
		// buadan Encapsulation01 deki ne ulasalim-   obje olusturmaliyiz ulasmak icin
		Encapsulation01 obj= new Encapsulation01();
		
		System.out.println(obj.getKimlikNo());
		
		
		
	

	}
	//Variable'a atanan degerin degistirilmesini istemiyorsaniz o variable ile 
		//alakali setter() olusturmamalisiniz
		
		//Variable'a atanan degerin okunmasini istemiyorsaniz, o variable ile alakali
		//getter() olusturmamalisiniz.
		
		//Sadece getter() kullanir ve hic setter() kullanmazsaniz, variable degerleri 
		//degistirilemez demektir. Bu tarz class'lara "Immutable Class" denir.
		
		//Sadece setter() kullanir ve hic getter() kullanmazsaniz, variable degerleri 
		//okunamaz demektir.
	
	//konsoldan   sirasi ile  source /generate setters und getters   seceriz oreadan olustururuz

	public char getIlkHarf() {
		return ilkHarf;
	}

	public void setIlkHarf(char ilkHarf) {
		this.ilkHarf = ilkHarf;
	}

	public double getPara() {
		return para;
	}

	public void setPara(double para) {
		this.para = para;
	}

	public boolean isEmekli() {
		return emekli;
	}

	public void setEmekli(boolean emekli) {
		this.emekli = emekli;
	}

}
