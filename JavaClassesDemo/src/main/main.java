package main;

public class main {

	public static void main(String[] args) {
          Product product= new Product();
          Product product2= new Product();
          
          
          product.name="asus";
          product.price=113.0;
          product.stock=9;
          product.shop="ETC";
          
          product2.name="lenovo";
          product.price=233.0;
          product.stock=11;
          product.shop="AGB";
          
          ProductManager productManager= new ProductManager();
          
          productManager.Add(product2);
          
          System.out.println("\n");
          
          productManager.Add(product);
          
          
          
	}

}
