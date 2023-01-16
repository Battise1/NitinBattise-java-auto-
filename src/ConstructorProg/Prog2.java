package ConstructorProg;

public class Prog2 {
	//Constructor overloading
	public Prog2()
	{
	System.out.println("This is zero argument constructor");
	}
	public Prog2(int a)
	{
	System.out.println("This is one argument constructor");
	}
	public Prog2(int a, int b)
	{
	System.out.println("This is two argument constructor");
	}
	public Prog2(double b)
	{
	System.out.println("This is one double type argument constructor");
	}
	public static void main(String[] args) {
	Prog2 x = new Prog2();
	Prog2 y = new Prog2(1);
	Prog2 z = new Prog2(1,2);
	Prog2 w = new Prog2(1111.111);
	}

}
