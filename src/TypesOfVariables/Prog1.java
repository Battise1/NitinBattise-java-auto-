package TypesOfVariables;

public class Prog1 {
	static int d = 100; //Global / Instance variable
	public void add()
	{
	int a = 10, b = 20, c = 0; // Local
	c = a + b;
	System.out.println("Add = " + c);
	System.out.println("D in add method = " + d);
	}
	public void multiply()
	{
	System.out.println("D = " + d);
	}
	public static void main(String[] args) {
	Prog1 z = new Prog1();
	z.add();

	// System.out.println("A = " + a); We cant access local variable outside the method
	

	System.out.println("D in main method = " + d);
	}

}
