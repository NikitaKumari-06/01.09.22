package com.oops.pll;
import com.oops.bll.Employee;

public class TestMain {
	public static void main(String[] args) {
		//creating parametrized constructor in creating new object
		Employee e1 = new Employee(8,"peter","tan",2500);
		System.out.println(e1);
		//setters
		e1.setSalary(999);
		System.out.println(e1);
		//getters 
		System.out.println("id is:"+e1.getId());
		System.out.println("firstname is:"+e1.getFirstName());
		System.out.println("lastname is:"+e1.getLastName());
		System.out.println("salary is :"+e1.getSalary());
		System.out.println("name is:"+e1.getName());
		System.out.println("annual salary is:"+e1.getAnnualSalary());
		//using function raisesalary
		System.out.println(e1.RaiseSalary(10));
		System.out.println(e1);
		
		
		}

	
}
