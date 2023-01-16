package ObjectOrientProgram;

public class Project1 {
	// object orient program
	public void add()
	{
		int a=10, b=20,c=0;
		c=a+b;
		System.out.println("addition =" + c);
	}
	public void multi()
	{
		int sum1=10, sum2=2,sum=0;
		sum=sum1+sum2;
		System.out.println("multiplication =" + sum);
	}
	
	public static void main(String[] args) {
		
		System.out.println("started main");
		Project1 a = new Project1();
		a.add();
		a.multi();
		
		

		
	}

}
