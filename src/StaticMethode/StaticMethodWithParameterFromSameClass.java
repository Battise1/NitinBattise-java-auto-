package StaticMethode;

public class StaticMethodWithParameterFromSameClass {
	//Static method with parameter from same class
	
	public static void add(int a,int b)
	{
	 int c = 0;
	  c = a + b;
	  System.out.println("addition =" + c);
	} 
	
	public static void main(String[] args) {
		add(10 , 20);

	}

}
