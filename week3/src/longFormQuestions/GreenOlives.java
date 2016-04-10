package longFormQuestions;

public class GreenOlives extends PizzaDecorator {

	private String desc;
	private double price;
	
	public GreenOlives(Pizza pizza) {
		super(pizza);
		desc = super.getDesc() + ", Green Olives (5.47)";
		price = super.getPrice() + 5.47;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return desc;
	}

	@Override
	public double getPrice() {
		return price;
	}
}
