package string;

public class string {

	public static void main(String[] args) {
		
	
	
    String[] ogrenciler = new String[3];
   ogrenciler[0]="mehmet";
   ogrenciler[1]="ahmet";
   ogrenciler[2]="ada";
   
   for(int i=0;i<ogrenciler.length;i++) {
	   System.out.println( "ogrenci=" + ogrenciler[i]);
   }
   
   System.out.println("------------------------\n");
    
   // yukar�daki ile ayn� i�i yap�yor
   
   for(String ogrenci:ogrenciler) {
     System.out.println(ogrenci);
        
	}
	}
}
