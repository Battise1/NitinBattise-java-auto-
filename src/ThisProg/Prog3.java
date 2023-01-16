package ThisProg;

public class Prog3 {
	//- It is also used when we want to call zero parameter constructor of its own class
	public Prog3()
	{
	System.out.println("Zero parametrized constructor");
	}
	public Prog3(int a)
	{
	this();
	System.out.println("Parametrized constructor A = " + a);
	}

	public static void main(String[] args) {
	Prog3 z = new Prog3(5);
	}

}
