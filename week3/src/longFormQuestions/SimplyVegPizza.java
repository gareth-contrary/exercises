package longFormQuestions;

public class SimplyVegPizza implements Pizza {

	private String desc = "SimplyVegPizza (230)";
	private double price = 230.0;
	
	public SimplyVegPizza() {
	}

	@Override
	public String getDesc() {
		return desc;
	}

	@Override
	public double getPrice() {
		return price;
	}

}
