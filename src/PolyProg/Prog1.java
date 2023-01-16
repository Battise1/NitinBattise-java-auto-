package PolyProg;

public class Prog1 {
	//compile time polymorphism

	public void add1()
	{
	int a = 1,b = 2,c;
	c = a + b;
	System.out.println("Sum = " + c);
	}
	public void add1(int a)
	{
	int c;
	c = a + a;
	System.out.println("Sum = " + c);
	}
	public void add1(int a, int b)
	{
	int c;
	c = a + b;
	System.out.println("Sum = " + c);
	}
	public void add1(double a)
	{
	double c;
	c = a + a;
	System.out.println("Sum = " + c);
	}
	public void add1(double a,double b)
	{
	double c;
	c = a + b;
	System.out.println("Sum = " + c);
	}
	public static void main(String[] args) {
	Prog1 z = new Prog1();
	z.add1();
	z.add1(10);
	z.add1(9, 99);
	z.add1(1.2);
	z.add1(22.33, 12.22);
	}

}
