package CollectionProg;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorProg {

	public static void main(String[] args) {

		Vector v1 = new Vector();
		for(int i=0;i<20;i++)
	 	     v1.add(i);
//		System.out.println(v1);
//		
//		System.out.println("-----------------");
//		 for(int i=0;i<10;i++)
//		 System.out.println(v1.get(i));
	
//		System.out.println("-----------------");
//		 for(Object value : v1)
//		 System.out.println(value);
	 
		 //Cursor
		// int i=0;
      System.out.println("---------------------");
      
//      
//		System.out.println("Enumeration Cursor Output");
//		Enumeration e = v1.elements();
//		while(e.hasMoreElements())
//		{
//		System.out.println(e.nextElement());
		// i++;
		// if(i==10)
		// break;
		
	System.out.println("---------------------------------------------------");
	
		/*System.out.println("Iterator Cursor Output");
		Iterator a = v1.iterator();
		while(a.hasNext())
		{
//		int value = (int) a.next();
//		if(value%2==0)
//		System.out.println(value);
//		else
//		a.remove();
			System.out.println(a.next());*/
	
	
/*	System.out.println("ListIterator Cursor Output");
	ListIterator x = v1.listIterator();
	while(x.hasNext())
	{
	int value1 = (int) x.next();
	if(value1==3)
	x.remove();
	else if(value1==2)
	x.add(2222);
	else if(value1==5)
	x.set(5555);
	 System.out.println(x.next());
	}
	System.out.println(v1);*/
	
	System.out.println("--------------------");
	
	ListIterator y = v1.listIterator();
	while(y.hasNext())
	{
	System.out.println(y.next()); //0
	}

	// System.out.println(y.previous()); //0
	// System.out.println(y.previous());
	System.out.println("--------------------");
	while(y.hasPrevious())
	System.out.println(y.previous());
			
	}
}
		


	


