package day15methodcreation;

import java.util.Scanner;

public class MethodCreation02 {

	public static void main(String[] args) {
		// Saati saniyeye, mil�i kilometreye, kilogrami gram�a 
		// ceviren bir method yaziniz.
		// Bu methodu main methodun disinda olusturup main methodun
		// icinden cagiriniz.
		Scanner scan=new Scanner (System.in );
		System.out.println("Birimi giriniz");
		String birim=scan.next();
		System.out.println("miktar giriniz");
		Double miktar=scan.nextDouble();
		
		d�n��t�r�c�(birim,miktar);
		
		scan.close();
	}
       public static void d�n��t�r�c�(String birim, double miktar) {
    	   switch (birim) {
    	   case "saat":
    		   System.out.println(miktar*60*60);
    		   break;
    	   case "mil":
    		  System.out.println(miktar*1.6);
    		   break;
    	   case "km":
    		   System.out.println(miktar*1000);
    		   break;
    	   case "kg":
    		   System.out.println(miktar*1000);
    		   break;
    		   default:
    			   System.out.println("saat, mil ve km d���nda girmeyiniz");
    	   }
    	   
       }
}

    	   
	
	


