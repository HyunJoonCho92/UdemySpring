package tv;

public class SamsungTV implements TV{

	@Override
	public void powerOn() {
		System.out.println("SamsungTV:전원켜다.");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV:전원끄다.");
	}
	
	@Override
	public void soundUp(int v) {
		System.out.println("SamsungTV:" + v + " 만큼 볼륨 높이다.");
	}
	
	@Override
	public void soundDown(int v) {
		System.out.println("SamsungTV:" + v + " 만큼 볼륨 낮추다.");
	}
}