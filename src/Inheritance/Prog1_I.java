package Inheritance;

public class Prog1_I {

		public static void main(String[] args) {
			Prog1_C z = new Prog1_C();
			z.bike();
			z.mobile();
			z.home();
			z.car();
			z.money();
			Prog1_P x = new Prog1_P();
			x.home();
			x.car();
			x.money();

			// x.bike(); //Parent class can't access child properties
			
	}

}
