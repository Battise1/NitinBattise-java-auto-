package Interface;

public class Prog3_IMP {

	public static void main(String[] args) {

		Prog3_VI x = new Prog3_VI();
		x.audioCalling();
		x.messaging();
		x.videoCalling();
		
		System.out.println("----------------------------------------------");
		
		 Prog3_JIO y = new  Prog3_JIO();
		 y.audioCalling();
		 y.messaging();
		 y.videoCalling();
		 
		 System.out.println("----------------------------------------------");
		 
		 Prog_3Airtel z = new Prog_3Airtel();
		 
		 z.audioCalling();
		 z.messaging();
		 z.videoCalling();
	}

}
