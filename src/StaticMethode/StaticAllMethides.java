package StaticMethode;

public class StaticAllMethides {
	
	
	public static void add()
    {
    int a =10, b=20, c=0;
     c=a+b;
    
   	  System.out.println("addition =" + c);
     }
	
	public static void sum()
	{
		int sum1=5,sum2=5,sum=0;
		sum=sum1+sum2;
		System.out.println("addition =" + sum);
		
	}
	
	public static void multi(int a,int b)
	{
		int c=0;
		c=a*b;
		System.out.println("Result =" + c);
	}

	public void addition()
	{
		int a=5,b=5,c=0;
		c=a+b;
		System.out.println("Adition = " + c);
	}
	
	public void div(int a,int b)
	{
		int c;
		c=a/b;
		System.out.println(" division = " + c);
	}
	
	
	
	public static void main(String[] args) {
       
		{
		System.out.println("Thise is static method");
		add();    // static method camm from same class
		sum();
		Project.add();  // static method call from different class
		multi(5, 5);   // static method with parameter call from same class
		Project.division(100, 5);    //static method with parametrer call fom deferent class
		 StaticAllMethides a = new  StaticAllMethides();
		 Project b = new Project();
		
		 System.out.println("------------------------------------------------------");
		
		 a.addition();     //non static method call from same class
		 b.substraction();  // non static method call from diferent class
		 a.div(10, 2);     //non static method with paramete call from same class
		 b.divs(10, 2);
		
		
		
		
		}
		
	}

}
