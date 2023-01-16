package StaticMethode;

public class Project {
	
         public static void add()
         {
         int a =100, b=200, c=0;
          c=a+b;
         
        	  System.out.println("addition =" + c);
        	  
          }
         
         
         public static void division(int a,int b)
     	{
     		int c=0;
     		c=a/b;
     		System.out.println("Result =" + c);
     	}
         
         public void substraction()
     	{
     		int a=50,b=15,c=0;
     		c=a-b;
     		System.out.println("Adition = " + c);
     	}
          
         public void divs(int a,int b)
     	{
     		int c;
     		c=a/b;
     		System.out.println(" division = " + c);
     	}
     	
         
           
         
         public static void main(String[] args) {
			add();
			division(10,20);
			Project x = new Project();	
			x.substraction();
			x.divs(1,3);
			
			
		}

}
