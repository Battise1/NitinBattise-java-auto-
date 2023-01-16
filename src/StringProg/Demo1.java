package StringProg;

public class Demo1 {
	
	public void comapreNumber()
	{
	int num1=10,num2=10;
	if(num1==num2)
	System.out.println("Both number are equal");
	else
	System.out.println("Both number are not equal");

	}
	public void compareString()
	{
	//When we compare string with == operator address (memory)

//	comparison will be carried out

	//so every time when compare string we must use equals method only.
	String str1="Harry", str2="Harry";  
	String str3= new String("Harry");
	
//	if(str1==str2)
//		System.out.println("Equal string");
//		else
//		System.out.println("Not Equal string");
//	
		System.out.println("***********");
		
		if(str1==str3)
		System.out.println("Equal string");
		else
		System.out.println("Not Equal string");

		}
		public static void main(String[] args) {
		Demo1 a = new Demo1();
		// a.comapreNumber();
		a.compareString();
		}

}
