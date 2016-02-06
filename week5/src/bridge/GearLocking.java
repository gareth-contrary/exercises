package bridge;

public class GearLocking implements Product {

	String type;
	
	public GearLocking(String type) {
		this.type = type;
	}
	
	@Override
	public String getType() {
		return type;
	}

}
