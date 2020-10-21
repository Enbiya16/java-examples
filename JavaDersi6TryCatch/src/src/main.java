package src;

public class main {

	public static void main(String[] args) {
 
		try 
		{ 
			// hatali bir kod yazdýk try içine
			int[] sayilar=new int[] {1,2,3};
			System.out.println(sayilar[5]);
		}
			
			
			catch (Exception exception) {
				
				// hata ile karþýlaþýnca sistem kýrýlmak yerine hata oluþtu mesajý göndericek
				System.out.println("Hata oluþtu.");
				//burada da hata nedenini yazdýrýcak
				System.out.println(exception);
			}

			finally { System.out.println("finally metodu her türlü çalýþýr en sonunda. ");
			}


} 
	}
