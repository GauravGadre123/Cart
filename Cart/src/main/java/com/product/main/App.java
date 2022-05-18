package com.product.main;

import com.product.service.Product;
import com.product.utill.Cart;

public class App 
{
    public static void main( String[] args )
    {

    	
    	int id=0;
    	int price=0;
    	
    	
    	// creating a new cart
    	Cart cart = new Cart();
    	
    	/*
		  in real time need to check one condition if cart is null then only create
		  cart otherwise use previous cart
		 
		  if(cart==null) { cart= new Cart();
		 
		  } else cart.addProduct(product);
		
		 */
    	
    	 id= (int)(Math.random() * 30);// get product id selected by user which we want to store in cart
    	price=(int)(Math.random() * 30); // get product price selected by user which we want to store in cart 
    	
    	// create a product selected by user
    	Product product1 = new Product(id,price);
    	
    	 id= (int)(Math.random() * 30);// get product id selected by user which we want to store in cart
    	 price=(int)(Math.random() * 30); // get product price selected by user which we want to store in cart 
    	
    	Product product2 = new Product(id,price);
    	
    	 id= (int)(Math.random() * 30);// get product id selected by user which we want to store in cart
    	 price=(int)(Math.random() * 30); // get product price selected by user which we want to store in cart 
    	
    	
    	Product product3 = new Product(id,price);
    	
    	// adding multiple products to cart
    	cart.addProduct(product1);
    	cart.addProduct(product2);
    	cart.addProduct(product3);
    	
    	// printing products in the cart 
    	System.out.println(cart.toString());
    }
}
