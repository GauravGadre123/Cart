package com.product.main;

import com.product.service.Product;
import com.product.utill.Cart;

public class App 
{
    public static void main( String[] args )
    {
    	Cart cart = new Cart();
    	
    	int id= (int)(Math.random() * 30);// get product id selected by user which we want to store in cart
    	int charge=(int)(Math.random() * 30); // get product price selected by user which we want to store in cart 
    	
    	Product product = new Product(id,charge);
    	
    	cart.addProduct(product);
    	
    	System.out.println(cart.toString());
    }
}
