package com.task.product;

import java.util.HashSet;
import java.util.Set;

public class ProductInput 
{
	public Set<Product> getProducts()
	{
		Set<Product> prd = new HashSet<Product>();
		
		prd.add(new Product("7654GFV", "iPhone17", 90000, "Packed"));
		prd.add(new Product("7954HGF", "SamsungS26", 80000, "Shipped"));
		prd.add(new Product("8765JHG", "Lg(TV)", 67000, "Deliverided"));
		prd.add(new Product("9873IHGN", "ASUS(Laptop)", 70000, "Deliverided"));
		prd.add(new Product("9873IHG", "ASUSvivobook", 70000, "Deliverided"));
		
		return prd;
	}
}
