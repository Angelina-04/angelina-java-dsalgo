package inheritance;

public class Application {
	public static void main(String[] args) {
		Parents Pobj = new Parents();
		System.out.println("Parent's  Name: "+ Pobj.getName()); 
		System.out.println("Parent's  Blood Group: "+ Pobj.getBloodGroup());
		System.out.println("Parent's  Surname: "+ Pobj.getSurName()); 
		System.out.println("Parent's  Car: "+ Pobj.getCar());
		System.out.println("Parent's  Home: "+ Pobj.getHome());
		
		
		ChildOne COneobj = new ChildOne();
		System.out.println("ChildOne's Name: "+ COneobj.getName());
		System.out.println("ChildOne's  Blood Group: "+ COneobj.getBloodGroup());
		System.out.println("ChildOne's  Surname: "+ COneobj.getSurName()); 
		System.out.println("ChildOne's  Car: "+ COneobj.getCar());
		System.out.println("ChildOne's  Home: "+ COneobj.getHome());

		ChildTwo CTwoobj = new ChildTwo();
		System.out.println("ChildTwo's  Name: "+ CTwoobj.getName());
		System.out.println("ChildTwo's  Blood Group: "+ CTwoobj.getBloodGroup());
		System.out.println("ChildTwo's  Surname: "+ CTwoobj.getSurName()); 
		System.out.println("ChildTwo's  Car: "+ CTwoobj.getCar());
		System.out.println("ChildTwo's  Home: "+ CTwoobj.getHome());
		
		ChildThree CThreeobj = new ChildThree();
		System.out.println("ChildThree's  Name: "+ CThreeobj.getName());
		System.out.println("ChildThree's  Blood Group: "+ CThreeobj.getBloodGroup());
		System.out.println("ChildThree's  Surname: "+ CThreeobj.getSurName()); 
		System.out.println("ChildThree's  Car: "+ CThreeobj.getCar());
		System.out.println("ChildThree's  Home: "+ CThreeobj.getHome());
		
	}
}
