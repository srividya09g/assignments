package io.javaclass.common;

public class Person {
	
	String Firstname;
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	String Lastname;
	int age;
	
	public Person(String firstname, String lastname,int age){
		this.Firstname = firstname;
		this.Lastname = lastname;
		this.age = age;
		
	}

}
