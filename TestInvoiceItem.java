package com.oops.pll;
import com.oops.bll.InvoiceItem;

public class TestInvoiceItem {
	public static void main(String[]args) {
		//parametrized constructor
		InvoiceItem itm1=new InvoiceItem("12234","shirt",1,200);
		System.out.println(itm1);
		
		//using getters
		System.out.println("\n id;"+itm1.getID());
		System.out.println("\n desc:"+itm1.getDesc());
		System.out.println("\n qty:"+itm1.getQty());
		//using function tostring
		System.out.println("\n details:"+itm1.tostring());
		//using function gettotal
		System.out.println("\n total price:"+itm1.getTotal());
		//using setters
		itm1.setQty(4);
		System.out.println(itm1);
		
		
	}

	
}
