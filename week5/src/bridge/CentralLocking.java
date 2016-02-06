package bridge;

public class CentralLocking implements Product {

	String type;
	
	public CentralLocking(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
} 
