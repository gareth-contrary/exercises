package longFormQuestions;

public class SimplyNonVegPizza implements Pizza {

	private String desc = "SimplyNonVegPizza (350)";
	private double price = 350.0;
	
	public SimplyNonVegPizza() {
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
