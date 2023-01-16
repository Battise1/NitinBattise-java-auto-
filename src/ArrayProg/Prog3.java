package ArrayProg;

import java.util.Scanner;

public class Prog3 {
	
	public static void main(String[] args) {
		/*int arraySize = 5;
		int arr[] = new int[arraySize];
		arr[0] = 12;
		arr[1] = 13;
		arr[2] = 14;
		arr[3] = 11;
		arr[4] = 20;
		for(int val : arr)
		System.out.println(val); */
		
		int arraySize;
		System.out.println("Enter size of array");
		Scanner z = new Scanner(System.in);
		arraySize = z.nextInt();
		System.out.println("Size of array is " + arraySize);
		int marks[] = new int [arraySize];
		System.out.println("Enter the elements of array");
		for(int i=0;i<arraySize;i++)
		{
		marks[i] = z.nextInt();
		}
		System.out.println("Array values are");
		for(int v : marks)
		System.out.print(v + " ");
		System.out.println(marks[100]); //5
	}
}
