package src;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		
        ArrayList<Customer> customers= new ArrayList<Customer>();
        
        Customer mehmet= new Customer(42,"Mehmet") ;
        customers.add(mehmet);
        
        Customer merve= new Customer(66,"merve") ;
        customers.add(merve);
        
        Customer zübeyde= new Customer(13,"zübeyde") ;
        customers.add(zübeyde);
        
        customers.remove(mehmet);
        
        for(Customer i:customers) {
        	
        	System.out.println("müþteri: ismi: " + i.name);
        	System.out.println("müþteri id: " + i.id);
        	System.out.println("\n");
        }
     
        
        
	}

}
