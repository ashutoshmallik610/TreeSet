package com.task.product;

import java.util.Objects;

public class Product implements Comparable<Product>
{
	private String productId;
	private String name;
	private int price;
	private String status;
	
	public Product(String productId, String name, int price, String status) {
		setProductId(productId);
		setName(name);
		setPrice(price);
		setStatus(status);
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
	    if (productId != null && !productId.isBlank()) {
	        this.productId = productId;
	    }
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
	    if (name != null && !name.isBlank()) {
	        this.name = name;
	    }
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
	    if (price > 0) {
	        this.price = price;
	    }
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
	    if (status != null && !status.isBlank()) {
	        this.status = status;
	    }
	}

	
	public void display()
	{
		System.out.println("Product Id : "+productId +" Name : "+name+ " Price : "+price +" Status : "+status);
	}

	@Override
	public int compareTo(Product o) {
		
		 int result = Integer.compare(this.price,o.price);
		 
		 if(result == 0)
		 {
			result = this.productId.compareTo(productId); 
		 }
		 
		 return result;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId);
	}

	@Override
	public boolean equals(Object obj) 
	{
		Product other = (Product) obj;
		return Objects.equals(productId, other.productId);
	}
	
}






