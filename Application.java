package com.Inheritance;
public class Application {
	public static void main(String[] args) {
		Parents Pobj = new Parents();
		System.out.println("Parent's  Name: "+ Pobj.getName()); 
		System.out.println("Parent's  Blood Group: "+ Pobj.getBloodGroup());
		System.out.println("Parent's  Surname: "+ Pobj.getSurName()); 
		System.out.println("Parent's  Car: "+ Pobj.getCar());
		System.out.println("Parent's  Home: "+ Pobj.getHome());
		System.out.println();
		
		ChildOne COneobj = new ChildOne();
		System.out.println("ChildOne's Name: "+ COneobj.getName());
		System.out.println("ChildOne's  Blood Group: "+ COneobj.getBloodGroup());
		System.out.println("ChildOne's  Surname: "+ COneobj.getSurName()); 
		System.out.println("ChildOne's  Car: "+ COneobj.getCar());
		System.out.println("ChildOne's  Home: "+ COneobj.getHome());
		System.out.println();

		ChildTwo CTwoobj = new ChildTwo();
		System.out.println("ChildTwo's  Name: "+ CTwoobj.getName());
		System.out.println("ChildTwo's  Blood Group: "+ CTwoobj.getBloodGroup());
		System.out.println("ChildTwo's  Surname: "+ CTwoobj.getSurName()); 
		System.out.println("ChildTwo's  Car: "+ CTwoobj.getCar());
		System.out.println("ChildTwo's  Home: "+ CTwoobj.getHome());
		System.out.println("ChildTwo's  Jewellery: "+ COneobj.getJewellery());
		System.out.println();
		
		ChildThree CThreeobj = new ChildThree();
		System.out.println("ChildThree's  Name: "+ CThreeobj.getName());
		System.out.println("ChildThree's  Blood Group: "+ CThreeobj.getBloodGroup());
		System.out.println("ChildThree's  Surname: "+ CThreeobj.getSurName()); 
		System.out.println("ChildThree's  Car: "+ CThreeobj.getCar());
		System.out.println("ChildThree's  Home: "+ CThreeobj.getHome());
		System.out.println();
		
		// Parent reference - child object(From Third Party)
		System.out.println("Parent reference child object(from Third Party Class):"); 
		Parents parentRef = ThirdPartyObjs.getChildOneDetails();
		System.out.println("Child one Name:" + parentRef.getName());
		System.out.println("Surname:" + parentRef.getSurName());
		System.out.println();

		Parents parentRefTwo = ThirdPartyObjs.getChildTwoDetails();
		System.out.println("Child Two Name:" + parentRefTwo.getName()); 
		System.out.println("Surname:" + parentRefTwo.getSurName());
		System.out.println();
		
		Parents parentRefThree = ThirdPartyObjs.getChildThreeDetails();
		System.out.println("Child Two Name:" + parentRefThree.getName()); 
		System.out.println("Surname:" + parentRefThree.getSurName());
		
		

	}
}
