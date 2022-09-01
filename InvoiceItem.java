package com.oops.bll;

public class InvoiceItem {
private String id;
private String desc;
private int qty;
private double unitprice;
public InvoiceItem() {
	
}
 public InvoiceItem(String id,String desc,int qty,double unitprice) {
	 this.id=id;
	 this.desc=desc;
	 this.qty=qty;
	 this.unitprice=unitprice;
 }
 public String getID() {
 return id;	 
 }
 public String getDesc() {
	 return desc;
 }
 public int getQty() {
	 return qty;
 }
 public void setQty(int qty) {
	 this.qty=qty;
 }
 public double getUnitPrice() {
	 return unitprice;
 }
 public void setUnitPrice(double unitprice) {
	this.unitprice=unitprice; 
 }
 public double getTotal() {
	 return unitprice*12;
 }
 public String tostring() {
	 return "id:"+id+"\n desc:"+desc+"\nqty:"+qty+"\n unitprice:"+unitprice;
 }
 
 }
