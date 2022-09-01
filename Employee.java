package com.oops.bll;

public class Employee {
private int id;
private String firstname;
private String lastname;
private int salary;


public Employee(int id, String firstname, String lastname, int salary ){
	this.id=id;
	this.firstname=firstname;
	this.lastname=lastname;
	this.salary=salary;
	}
public int getId() {
	return id;
}
public String getFirstName() {
return firstname;	
}
public String getLastName() {
	return lastname;
}
public String getName() {
	return firstname+""+lastname;
	
}
public int getSalary() {
	return salary;	
}
public void setSalary(int salary) {
	this.salary=salary;
}
public int getAnnualSalary() {
	return salary*12;
}
public int RaiseSalary(int percent) {
	int newsalary=salary+(salary*percent/100);
	return newsalary;
}

public String tostring() {
	return "\n id:"+id+"\n name:"+firstname+lastname+"\n salary:"+salary;
	
}



}

