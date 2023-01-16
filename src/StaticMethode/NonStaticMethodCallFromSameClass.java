package StaticMethode;

import ObjectOrientProgram.Project1;

public class NonStaticMethodCallFromSameClass {

	public void sum()
	{
		int a=10, b=20,c=0;
		c=a+b;
		System.out.println("addition =" + c);
		
	}
	
	public static void main(String[] args) {
		
		NonStaticMethodCallFromSameClass a = new NonStaticMethodCallFromSameClass();
		a.sum();
		Project1 b = new Project1();// non static method call from diffrent class
		b.multi();                  // here is creat a object by which we call method from another class
		
		
	}

}
