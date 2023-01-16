package ThisProg;

public class Prog1 {
	public void show()
	{
	System.out.println(this);
	}
	public static void main(String[] args) {
	Prog1 x = new Prog1();
	x.show();
	System.out.println(x);
	System.out.println("******************");
	Prog1 y = new Prog1();
	y.show();
	System.out.println(y);
	}

}
