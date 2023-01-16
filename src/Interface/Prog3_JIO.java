package Interface;

public class Prog3_JIO implements Prog3_TRI{
	@Override
	public void audioCalling() {
	System.out.println("Jio gives unlimited free calling");
	}
	@Override
	public void videoCalling() {
	System.out.println("Jio give 1.5GB data/day");
	}
	@Override
	public void messaging() {
	System.out.println("Jio gives 100 msg/day");
	}
	@Override
	public void five_G_Service() {
	System.out.println("Jio provide pure 5G services @ 600/month");
	}

}
