package com.java.initialprograms;

public class MyProfile {
	String name = "Deborah";
	String gender = "Female";
	String country = "India";
	int age = 26;
	int salary = 80000;
	String address = "Flat No:106,Near 7th Avenue Bakery,Manu Vihar Apartments,A.S Nagar,ECIL";

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}
    public String getCountry() {
    	return country;
    }
	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public String getAddress() {
		return address;
	}
	public static void main (String[] args) {
		final MyProfile profileObject = new MyProfile();
		String myName = profileObject.getName();
		String myGender = profileObject.getGender();
		String myCountry = profileObject.getCountry();
		int myAge = profileObject.getAge();
		int mySalary = profileObject.getSalary();
		String myAddress = profileObject.getAddress();
		System.out.println("NAME:" + myName);
		System.out.println("GENDER:"+myGender);
		System.out.println("NATIONALITY"+myCountry);
		System.out.println("AGE:"+myAge);
		System.out.println("SALARY:"+mySalary);
		System.out.println("ADDRESS:"+myAddress);
	}
}


