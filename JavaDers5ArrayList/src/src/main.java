package src;

import java.util.ArrayList;
import java.util.Collections;

public class main {

	public static void main(String[] args) {
            ArrayList paket = new ArrayList();
            
            paket.add("ahmet");
            paket.add(3);
            paket.add(12);
            
            
            System.out.println(paket.get(0));

            System.out.println(paket.get(1));
            
            System.out.println(paket.get(2));

            paket.set(2, 100);
            
            System.out.println(paket.get(2));
            
            
            //------------
            
            ArrayList<String> sehir =new ArrayList<String>();
            
            sehir.add("istanbul");
            sehir.add("ankara");
            sehir.add("gaziantep");
            
            Collections.sort(sehir); // sıralar isme göre
            
            for(String i:sehir) {
            	
            	System.out.println("sehir: "+i);
            }
            
            
            
            
	}

}
