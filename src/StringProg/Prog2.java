package StringProg;

public class Prog2 {
	
	public static void main(String[] args) {
		String str1 = "Harry";
		String str2 = "Harry";
		String str3 = "harrY";
		
//		String str4 = new String("Harry");
//		//Comparing identical strings with content of string
//		if(str1.equals(str4))
//		System.out.println("Equal");
//		else
//		System.out.println("Not Equal");
//		System.out.println("--------");
		//Comparing identical strings with content of string
//		if(str1.equals(str4))
//		System.out.println("Equal");
//		else
//			System.out.println("Not Equal");
//		System.out.println("--------");
//		//Comparing two different strings with content of string
//		if(str1.equals(str3))
//		System.out.println("Equal");
//		else
//		System.out.println("Not Equal");
//		Comparing two strings by ignoring the case
		
		
		if(str1.equalsIgnoreCase(str3))
		System.out.println("Equal");
		else
		System.out.println("Not Equal");
	}

}
