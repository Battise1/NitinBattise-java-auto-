 package SimpleJavaProgram;

public class ReturnMethod1 {


		public static void m1()
		{
		System.out.println("This is m1 method");
		}
		public void m2()
		{
		System.out.println("This is m2 method");
		}
		public static int m3()
		{
		return 11;
		}
		public static int sum(int num1, int num2)
		{
		return num1+num2;
		}
		public static void main(String[] args) {
		// ReturnMethod1 a = new ReturnMethod1();
		// a.m2();
		// m1();
		int mf = 100;
		int out = m3();
		int foutput = mf * out;
		System.out.println(foutput);

		// int output = m3(); //m3() method returning 11
		// System.out.println(output);
		//
		// System.out.println("M3 returning = " + m3());
		}
	}


