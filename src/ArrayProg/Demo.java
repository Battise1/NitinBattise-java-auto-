package ArrayProg;

public class Demo {
	
	public static void main(String[] args) {
		
		int mockMark1 = 12;
		int mockMark2 = 13;
		int mockMark3 = 15;
		int mockMark4 = 10;
		int mockMark5 = 17;
		
		int mockMarksFirst[] = {12,10,12,15,19,10,10};
		
		String day1 = "Monday";
		String day2 = "Tuesday";
		String day3 = "Wednesday";
		String day4 = "Thursday";
		String days[] = {"Monday","Tuesday","Wednesday","Thursday"};
		
		
		
		String mockmarks[] = new String[5];
		mockmarks[0] ="12";
		mockmarks[1] ="13";
		mockmarks[2] ="14";
		mockmarks[3] ="15";
		mockmarks[4] ="16";
		
		System.out.println("Mockmark =" + mockmarks[3]);
		
		System.out.println(mockmarks.length);
		
		String array[] = new String[10]; //0 - 9
		
		array[0] = "Ron";
		array[1] = "Harry";
		array[2] = "Albus";
		array[3] = "Dobby";
		System.out.println(array[2]);
		System.out.println(array[0]);
		System.out.println(array[9]);
		
		System.out.println("---------");
		
		for(int i=0;i<10;i++)
		{
		System.out.print(array[i]  + " ");
		}
		// System.out.println(array[10]);
		//java.lang.ArrayIndexOutOfBoundsException

		System.out.println();
		System.out.println(array.length); //10
		System.out.println("Length of days = " + days.length);
		}

}
