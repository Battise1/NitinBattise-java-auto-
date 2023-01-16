package Interface;

public class Prog3_VI implements Prog3_TRI{
	
	@Override
	public void audioCalling() {
	System.out.println("VI gives 50000 min free calling");
	}
	@Override
	public void videoCalling() {
	System.out.println("VI give 2GB data/day");
	}
	@Override
	public void messaging() {
	System.out.println("VI gives 100 msg/day");
	}
	@Override
	public void five_G_Service() {
	System.out.println("VI provide 5G services @ 400/month");

}
}
