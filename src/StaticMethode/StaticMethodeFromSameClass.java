package StaticMethode;

public class StaticMethodeFromSameClass {
	// static method call fom same class
	public static void sum()
	
	{
		int sum1=10, sum2=20, sum=0;
		sum=sum1+sum2;
		System.out.println("sum =" + sum);
	}
	
	public static void multi()
	{
		int a=10, b=20, c=0;
				c=a*b;
				System.out.println("Multiplication =" + c);
	}
	
	public static void main(String[] args) {
		sum();
		multi();
		
		

	}

}
