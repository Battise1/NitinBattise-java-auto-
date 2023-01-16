package CollectionProg;

import java.util.TreeSet;

public class TreeSetProg {

	public static void main(String[] args) {

		TreeSet a = new TreeSet();
		TreeSet b = new TreeSet();

		// a.add(null); //Not accepting :- NullPointerException

		a.add("Z"); //100
		a.add("E");
		a.add("B");
		a.add("Y");
		// a.add(100);
		System.out.println(a);
		b.add(100);
		b.add(90);
		b.add(50);
		b.add(30);
		b.add(1);
		System.out.println(b);
//		b.add("C");
		System.out.println(b);
	}

}
