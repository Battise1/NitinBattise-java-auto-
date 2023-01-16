package CollectionProg;

import java.util.HashSet;

public class HashSetProg {

	public static void main(String[] args) {

		HashSet a = new HashSet(); //IC=16, LF=.75=75%
		HashSet b = new HashSet(1000); //IC=1000, LF=.75=75%
		HashSet c = new HashSet(100,90); //IC=100, LF=.90=90%
		HashSet d = new HashSet(a);
		a.add(10);
		a.add(12);
		a.add(20);
		a.add(9);
		a.add(1);
		a.add(2);
		a.add(5);
		System.out.println(a);
		a.add("Harry");
		a.add("Json");
		a.add("Army");
		System.out.println(a);
		a.add(20);
		System.out.println(a);
		a.add(null);
		System.out.println(a);
		a.add(null);
		System.out.println(a);
	}

}
