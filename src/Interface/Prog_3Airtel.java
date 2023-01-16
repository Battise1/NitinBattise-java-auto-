package Interface;

public class Prog_3Airtel implements Prog3_TRI{
	@Override
	public void audioCalling() {
	System.out.println("Airtel gives 5000 min free calling");
	}
	@Override
	public void videoCalling() {
	System.out.println("Airtel give 1.5GB data/day");
	}
	@Override
	public void messaging() {
	System.out.println("Airtel gives 100 msg/day");
	}
	@Override
	public void five_G_Service() {
	System.out.println("Airtel provide 5G services @ 500/month");
	}

}
