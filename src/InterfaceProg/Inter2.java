package InterfaceProg;

public class Inter2 implements Inter1{

	@Override
	public void devProj() 
	{
		System.out.println("I am dev");		
	}

	@Override
	public void testProj() 
	{
		System.out.println("I am tester");		
	}

	@Override
	public void manageProj() 
	{
		System.out.println("I am manager");		
	}

}
