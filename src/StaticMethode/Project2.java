package StaticMethode;

public class Project2 {
	// static method call same class
	
	public static void show()
	
	{
		System.out.println("This is static show method");	
	}
	public static void display()
	{
		System.out.println("this is static disply method");
	}
	public static void main(String[] args) {
		System.out.println("main started");
		show();
		display();
		Program1.sum();            // static method call from different class
		Program1.add(100 ,200);
		System.out.println("-----------------------------------------------");
		Project3.details("nitin" ,101 ,75000.56 , "Nashik" , 'A');// static method call from different class with parameter
		
		System.out.println("main Ended");

		
		
		
		
		
	}

}
