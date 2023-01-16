package StringProg;

public class Demo {
	public static void main(String[] args) {
		String str = "Harry";
		System.out.println(str);
		str.concat("Potter");
		System.out.println(str); //HarryPotter
		
		
		System.out.println("-----------");
		
		
		StringBuffer a = new StringBuffer("Ron");
		System.out.println(a);
		a.append("Wisely");
		System.out.println(a);
		
	}
}
