package ArrayProg;

public class Prog5 {
	
	public static void main(String[] args) {
		String movieChar[][] = new String[2][2];
		movieChar[0][0] = "Ron";
		movieChar[0][1] = "Albus";
		movieChar[1][0] = "Dobby";
		movieChar[1][1] = "Harry";
		//00 01 10 11
		for(int i=0;i<2;i++) //i=2 2<2 x
		{
		for(int j=0;j<2;j++) //j=2 2<2 x
		{
		System.out.print(movieChar[i][j] + " ");
		}
		System.out.println();
		}
		//00 01 Ron Albus
		//10 11 Dobby Harry
		// String movieChar1[][] = new String[2][3];
		// System.out.println(movieChar1.length);
	}

}
//Ron Albus 00 01
//Dobby Harry 10 11
//Ron


