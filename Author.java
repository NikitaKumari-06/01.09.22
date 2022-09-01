package com.oops.bll;

public class Author {
	private String firstname;
	private String lastname;
	private String bookname;
	
	public Author() {

}
	public Author(String firstname, String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
	}
	public Author(String firstname, String lastname, String bookname) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.bookname=bookname;
	}
	public void setFirstName(String firstname) {
		this.firstname=firstname;
	}
	public void setLastName(String lastname) {
		this.lastname=lastname;
	}
	public void setBookName(String bookname) {
		this.bookname=bookname;
	}
	public String getFirstName() {
		return firstname;
	}
	public String getLastName() {
		return lastname;
	}
	public String getBookName() {
		return bookname;
	}
	
	
	public String tostring() {
	
		return "firstname:"+firstname+"\n lastname:"+lastname+"\nbookname:"+bookname;
	}
	
	
	
	}
