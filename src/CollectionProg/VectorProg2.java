package CollectionProg;

import java.util.Vector;

public class VectorProg2 {

	public static void main(String[] args) {


		Vector v1 = new Vector(); //CC = 10 = 20 = 40 = 80
		Vector v2 = new Vector(500); //CC = 500 = 1000 = 2000
		Vector v3 = new Vector(20,11); //CC = 20 + 11 = 31 + 11 = 42
		Vector v4 = new Vector(v1);
		System.out.println(v3);
		System.out.println("Capacity of V1 = " + v1.capacity());
		System.out.println("Capacity of V2 = " + v2.capacity());
		System.out.println("Capacity of V4 = " + v4.capacity());
		System.out.println("Capacity of V3 = " + v3.capacity());
		for(int i=0;i<20;i++)
		v3.add(i);
		System.out.println("Capacity of V3 = " + v3.capacity());
		v3.add("ABC");
		System.out.println("Capacity of V3 after growing = " + v3.capacity());
		v1.add("Ron");
		v1.add(100);
		v1.add(1.222);
		v1.add('c');
		v1.addElement(1000);
		System.out.println(v1);
		v1.remove(0);
		v1.removeElement(1);
		v1.set(0, 100000);
		v1.setElementAt(1, 11);
		v1.setElementAt(11, 1);
		v1.add("Ron");
		v1.add(100);
		v1.add(1.222);
		v1.add('c');
		v1.addElement(1000);
		System.out.println(v1);
		//Amol - Amu Ramkishan aaaaaaa
		System.out.println("-----------------------------");
		for(Object value : v1)
		System.out.println(value);
	}

}
