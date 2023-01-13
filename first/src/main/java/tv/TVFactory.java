package tv;

public class TVFactory {
	public TV getTV(String name) {
		
		if(name.equals("삼성")) {
			return new SamsungTV();
		}
		else if(name.equals("LG")) {
			return new LgTV();
		}
		else {
			return null;
		}
		
	}
}
