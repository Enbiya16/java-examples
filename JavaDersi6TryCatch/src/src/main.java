package src;

public class main {

	public static void main(String[] args) {
 
		try 
		{ 
			// hatali bir kod yazd�k try i�ine
			int[] sayilar=new int[] {1,2,3};
			System.out.println(sayilar[5]);
		}
			
			
			catch (Exception exception) {
				
				// hata ile kar��la��nca sistem k�r�lmak yerine hata olu�tu mesaj� g�ndericek
				System.out.println("Hata olu�tu.");
				//burada da hata nedenini yazd�r�cak
				System.out.println(exception);
			}

			finally { System.out.println("finally metodu her t�rl� �al���r en sonunda. ");
			}


} 
	}
