package CastingProg;

public class Prog2_IMP extends Prog2_C{

	public static void main(String[] args) {
//
//		Prog2_C a = new Prog2_C();
//		a.child();
//		a.parent();
		
	//Upcasting	 child property into parent object
//		
//		Prog2_P z = new Prog2_C();
//		z.parent();
//		//z.child();
		
// down casting
		
		Prog2_C x = (Prog2_C) new Prog2_P();
		x.parent();
		x.child();
	}

}
