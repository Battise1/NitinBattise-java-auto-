package StaticMethode;

public class Project3 {
	
	public static void details(String name,int empId, double salary, String address, char grade)
	{
		System.out.println("Employ name = " + name);
		System.out.println("Employ ID = " + empId);
		System.out.println("Employ salary = " + salary);
		System.out.println("Employ address = " + address);
		System.out.println("Employ grade = " + grade);
	}

	public static void main(String[] args) {
          details("nitin" ,101 ,75000.56 , "Nashik" , 'A');
		
	}

}
