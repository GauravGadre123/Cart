package com.product.utill;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.product.service.Product;


public class Cart {
	
	private List<Product> cart = new LinkedList<Product>();

	public void addProduct(Product prod) {

		boolean isFound = false;
		for (Product p : cart) {
			if (p.getId() == prod.getId()) {
				isFound = true;
				break;
			}
		}
		if (!isFound)
			cart.add(prod);
	}

	public void deleteProduct(Product prod) {
		Iterator<Product> itr = listCart();
		while (itr.hasNext()) {
			Product p = itr.next();
			if (p.getId() == prod.getId() ) {
				itr.remove();
			}
		}
	}

	public Iterator<Product> listCart() {

		System.out.println(cart.size());
		return cart.iterator();
		
	}
	
	


	public int getTotalCost() {
		int total = 0;
		for (Product prod : cart) {
			total += prod.getPrice();
		}
		return total;
	}

	@Override
	public String toString() {
		return "Cart [cart=" + cart + "]";
	}

	
	
	
}
