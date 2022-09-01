package com.oops.pll;
import com.oops.bll.Author;

public class TestAuthor {
	public static void main(String[] args) {
		Author a1=new Author();
		System.out.println(a1);

	Author a2= new Author("ramesh","singh");
	
	Author a3=new Author("vidya","sinha","storybook");
	System.out.println(a3);
	//getters in 2nd object
	System.out.println("\n firstname is:"+a2.getFirstName());
	System.out.println("\n lastname is :"+a2.getLastName());
	System.out.println("\n bookname is:"+a2.getBookName());
	//tostring in 3rd object
	System.out.println("\n detail"+a3.tostring());
	//getters in first object
	System.out.println("\n firstname:"+a1.getFirstName());
	System.out.println("\n lastname:"+a1.getLastName());
	System.out.println("\n bookname:"+a1.getBookName());
	//reference operator
	Author a4;
	a4= new Author();
	System.out.println("\n reference:"+a4.tostring());
	
	
	//When I create object with default constructor it will assign 
	//the value null by itsel.
	
	//for creating object with a reference first we give new keyword then 
	//assign it with new object.

}
}