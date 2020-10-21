package main;

public class main {

	public static void main(String[] args) {
		 
		CustomerManager customerManager = new CustomerManager();
		
		CustomerManager customerManagr2 = new CustomerManager();
		
		//customerManager ve customerManager2 ayrı ayrı bilgiler içerir ayrı ayrı çalışır
		
		customerManager.Add();
		
		int i=8;
		int j=9;
		
		System.out.println(customerManager.Plus(i, j));
		
	}

}
