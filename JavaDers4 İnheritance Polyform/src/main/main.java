package main;

public class main {

	public static void main(String[] args) {
		
		BaseDatabase[] baseDatabase = new BaseDatabase[] {new CustomerDatabase(),new WishlistDatabase(),new PublicDatabase()};
		
		WishlistDatabase.Added();
		
		PublicDatabase.Added();

	}

}
