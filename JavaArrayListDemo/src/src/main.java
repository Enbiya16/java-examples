package src;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		
        ArrayList<Customer> customers= new ArrayList<Customer>();
        
        Customer mehmet= new Customer(42,"Mehmet") ;
        customers.add(mehmet);
        
        Customer merve= new Customer(66,"merve") ;
        customers.add(merve);
        
        Customer z�beyde= new Customer(13,"z�beyde") ;
        customers.add(z�beyde);
        
        customers.remove(mehmet);
        
        for(Customer i:customers) {
        	
        	System.out.println("m��teri: ismi: " + i.name);
        	System.out.println("m��teri id: " + i.id);
        	System.out.println("\n");
        }
     
        
        
	}

}
