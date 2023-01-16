package SuperProg;

public class Prog1_C extends Prog1_P{
	int a = 200;

	public void display()
	{
	System.out.println("Display method of Child class");
	super.display();
	}
	public void show()
	{
		System.out.println("Same class A = " + a);
		System.out.println("Parent class A = " + super.a);
		}

}
