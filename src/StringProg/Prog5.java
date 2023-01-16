package StringProg;

public class Prog5 {
	
	public static void main(String[] args) {
		String str1 = "Ron Wisely is Harry Pooter best friend";
		// System.out.println(str1.substring(3)); // Wisely is Harry Pooter best friend
		
		// System.out.println(str1.substring(4)); //Wisely is Harry Pooter best friend
		
		// System.out.println(str1.substring(3, 7)); // Wis (3-6)
		// System.out.println(str1.substring(6, 10)); //sely (6-9)
		String str2 = "Albus",str3 = "Dumbdore";
		// System.out.println(str2.concat(str3));
		// System.out.println(str2.concat(" ").concat(str3));
		// System.out.println(str2.concat(" Head master ").concat(str3).concat(" is most powerful person"));
		
		// System.out.println(str2.replace("Albus", "Albus Dumbdore the head master"));
		
		// System.out.println(str2);
		// System.out.println(str1.replace("i", "iiii"));
		String str10 = "I am student ";
		String str11 = " of automation class";
		String str12 = "I am also learning API";
		System.out.println(str10.trim());
		System.out.println(str11.trim());
		System.out.println(str12.trim());
		System.out.println(str10.trim()+ " " + str11.trim());
		}
}
