package string;

public class string2 {

	public static void main(String[] args) {
		String mesaj="sounds cool.";
		
		System.out.println("eleman sayisi:" + mesaj.length());
		System.out.println("5. eleman" +mesaj.charAt(4));
		System.out.println(mesaj.concat(" hurray"));
		System.out.println(mesaj.startsWith("s"));
		System.out.println(mesaj.endsWith("."));
		
		char[] karakterler= new char[7];
		mesaj.getChars(0,5, karakterler, 2);
		System.out.println(karakterler);
		
		
		String mesaj2 = mesaj.replace(".", "!");
		System.out.println(mesaj2);
		
		System.out.println(mesaj.toUpperCase());
	}

}
