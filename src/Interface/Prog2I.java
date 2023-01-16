package Interface;

public class Prog2I implements  Prog2F {

	@Override
	public void devProj() {
		
   System.out.println("developer");		
	}

	@Override
	public void testProj() {
    System.out.println("tester");		
	}

	@Override
	public void manageProj() {
    System.out.println("manager");		
	}

}
