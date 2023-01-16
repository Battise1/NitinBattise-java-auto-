package SwichCase;

public class Project3 {

	public static void main(String[] args) {
		
		int a=15,b=8;
		char operator ='+';
		
	
		switch (operator)
		{
		
		case '+':
		System.out.println("Ente the value of addition =" + (a+b));
		break;
		case '-':
			System.out.println("Enter the value of substraction =" + (a-b));
			break;
		case '*':
			System.out.println("Enter the value of Multiplication =" + (a*b));
			break;
		case '/':
			System.out.println("Enter the value of division =" + (a/b));
			default:
				System.out.println("Wrong value");
	}
	

	}

}
