package com.iterator;

import java.util.Iterator;
import java.util.TreeSet;

class Payment implements Comparable<Payment>
{
	String refId;

	public Payment(String refId) {
		super();
		this.refId = refId;
	}

	@Override
	public int compareTo(Payment o) {
		int result = this.refId.compareTo(o.refId);
		return result;
	}
	
}

public class Driver {

	public static void main(String[] args) {

		TreeSet<Payment> payments = new TreeSet<Payment>();
		
		Payment p = new Payment("ABCD");
		Payment p1 = new Payment("DFGH");
		Payment p2 = new Payment("PUIY");
		Payment p3 = new Payment("ITBN");
		Payment p4 = new Payment("ABCD");
		
		payments.add(p);
		payments.add(p1);
		payments.add(p2);
		payments.add(p3);
		payments.add(p4);
		
		Iterator<Payment> itr = payments.iterator();
		
		while (itr.hasNext()) 
		{
			Payment pys = itr.next();
			
			System.out.println(pys.refId);
			
		}
		

	}

}
