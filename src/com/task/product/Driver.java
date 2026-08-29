package com.task.product;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {
		
		ProductInput prdiInput = new ProductInput();
		
		Set<Product> prds = prdiInput.getProducts();
		
		TreeSet<Product> pr = new TreeSet<Product>(prds);
		
		Iterator<Product> itr = pr.iterator();
		
		while(itr.hasNext())
		{
			Product p = itr.next();
			p.display();
		}
		
	}

}
