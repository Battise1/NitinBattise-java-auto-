package ElseIfStatement;

public class Project {

	public static void main(String[] args) {
		
		
		int mark = 99;
		if (mark>=40  && mark<60)
		{
			System.out.println("Student is passed in second class");
		}
		else if(mark>=60 && mark<75)
		{
			System.out.println("student is passed in fist class");
		}
		else if(mark>=75 && mark<90)
		{
			System.out.println("student is passed in distinction");
		}
		else if(mark>=90 && mark<=100)
		{
			System.out.println("student is passed in merit");
			
		}
		else if(mark>100)
		{
			System.out.println("invalid creditails");
		}
		else
			System.out.println("student is fail");
		
			
			

	}

}
