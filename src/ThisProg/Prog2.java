package ThisProg;

public class Prog2 {
	int num1 = 10;
	public void display()
	{
	int num1 = 20;
	System.out.println(num1); //20
	System.out.println(this.num1);
	}
	public static void main(String[] args) {
	Prog2 z = new Prog2();
	z.display();
	}

}
