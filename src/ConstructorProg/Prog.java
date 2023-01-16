package ConstructorProg;

public class Prog {
	static int a,b;
	
	public Prog()
	{
	a = 10;
	b = 20;
	System.out.println("This is zero parameter constructor");
	}
	public static void main(String[] args) {
	System.out.println("A = " + a); //0
	System.out.println("B = " + b);
	//0
	Prog x = new Prog();
	
	System.out.println("A = " + a);
	System.out.println("B = " + b);
	}
}
