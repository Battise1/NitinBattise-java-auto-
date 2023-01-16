package CollectionProg;

import java.util.Vector;

public class VectorProg {

	public static void main(String[] args) {

		Vector v = new Vector();
		Vector v1 = new Vector(100);
		System.out.println(v.capacity());
		for(int i=0;i<10;i++)
		v.add(i);
		System.out.println(v);
		v.add(100);
		System.out.println(v);
		System.out.println(v.capacity());
		for(int i=0;i<100;i++)
		v1.add(i);
		System.out.println(v1);
		System.out.println(v1.capacity()); //100
		v1.add(1000);
		System.out.println(v1.capacity()); //200
		//Puja Rohidas
		//Sameer = Sam
	}

}
