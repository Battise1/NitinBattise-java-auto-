package ThisProg;

public class Prog4 {
	//- This is also used to call parameterized constructor of its own class

	public Prog4()
	{
	this(12);
	System.out.println("Zero parametrized constructor");
	}
	public Prog4(int a)
	{
	this(12.2);
	System.out.println("Parametrized constructor A = " + a);
	}
	public Prog4(double a)
	{
	System.out.println("Parametrized constructor A = " + a);
	}
	public static void main(String[] args) {
	Prog4 z = new Prog4();
	}

}
