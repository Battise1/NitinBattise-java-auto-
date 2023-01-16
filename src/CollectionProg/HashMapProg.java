package CollectionProg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapProg {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		
		hm.put(3, "Ferrari");
		hm.put(2, "Lamborgini");
		hm.put(4, "Mastang");
		hm.put(1, "Porsh");
		
		System.out.println(hm);
		hm.put(null, "Twitter");
		System.out.println(hm);
		hm.put(null, "Meta");
		System.out.println(hm);
		hm.put(5, "ABC");
		hm.put(6, "ABC");
		hm.put(10.5, 'a');
		System.out.println("HM = " + hm);
		
		System.out.println("------------");
//		System.out.println(hm.keySet());
//		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		System.out.println("------------");
		
		Set a = hm.entrySet();
		Iterator itr = a.iterator();
//		System.out.println("For Output ------------");
//		for(;itr.hasNext();)
//		{
//		System.out.println(itr.next()); //8 = 8
//		}
		System.out.println("While Output ------------");
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
	}
}
		


