package spring.tv;

public class LgTV implements TV{
	
	public LgTV() {
		System.out.println("LgTV생성자 호출");
	}

	@Override
	public void powerOn() {
		System.out.println("LgTV:전원켜다.");
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV:전원끄다.");
	}
	
	@Override
	public void soundUp(int v) {
		System.out.println("LgTV:" + v + " 만큼 볼륨 높이다.");
	}
	
	@Override
	public void soundDown(int v) {
		System.out.println("LgTV:" + v + " 만큼 볼륨 낮추다.");
	}
}
