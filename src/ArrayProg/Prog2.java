package ArrayProg;

import java.util.Scanner;

public class Prog2 {
	
	
	public static void main(String[] args) {
		// int num1 = 10, num2 = 20, sum = 0;
		// sum = num1 + num2;
		// System.out.println("Addition = " + sum);

		int num11, num22, sum11;
		System.out.println("Enter two int values for addition operation");
		Scanner a = new Scanner(System.in);
		num11 = a.nextInt(); //6
		num22 = a.nextInt();
		sum11 = num11 + num22;
		System.out.println("Sum = " + sum11);
		String name = a.next();
		System.out.println("Input from user = " + name);
	}

}
