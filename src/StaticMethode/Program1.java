package StaticMethode;

public class Program1 {
// static method call from same class
	
	public static void sum()
	{
		int a=12, b=10, c=0;
		c = a + b;
		
		System.out.println("Enter the value of a =" + c);
	}
	public static void add(int a,int b)  // parameter type
	{int c = 0;
	c = a + b;
	System.out.println("Addition of 2 numbers with paramete = " + c );
	}
	public static void main(String[] args) {
    sum();
    add(100 , 200);
		
	}

}
