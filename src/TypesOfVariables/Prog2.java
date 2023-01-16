package TypesOfVariables;

public class Prog2 {
	int num1 = 10; // 4 x no of object (3) = 12 //Instance / Global /
	//Non static
	static int num2 = 10; //4 byte //Instance / Global / static
	public void increment()
	{
	num1++; //11
	num2++; //10 -> 11 - 12 - 13
	System.out.println(num1 + " " + num2);
	}
	public static void main(String[] args) {
	Prog2 x = new Prog2(); //Num1 = 10 num2=10
	x.increment();
	Prog2 y = new Prog2(); //Num1 = 10 num2=11
	y.increment();
	Prog2 z = new Prog2(); //Num1 = 10 num2=12
	z.increment();
	Prog2 z11 = new Prog2(); //Num1 = 10 num2=13
	z11.increment();
	}

}
