package com.hcl1;

public class Course {
String name;
String mentor;
Double fee;
public Course()
{
	
}
public Course(String name, String mentor, Double fee) {
	super();
	this.name = name;
	this.mentor = mentor;
	this.fee = fee;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMentor() {
	return mentor;
}
public void setMentor(String mentor) {
	this.mentor = mentor;
}
public Double getFee() {
	return fee;
}
public void setFee(Double fee) {
	this.fee = fee;
}
public void display() {
	System.out.println("The Details are");
	System.out.println("The course name is "+name);
	System.out.println("The name of the mentor is "+mentor);
	System.out.println("The fee for the course is "+fee);
}
}
