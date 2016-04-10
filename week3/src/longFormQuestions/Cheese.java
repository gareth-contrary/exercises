package longFormQuestions;

public class Cheese extends PizzaDecorator {

	private String desc;
	private double price;
	
	public Cheese(Pizza pizza) {
		super(pizza);
		desc = super.getDesc() + ", Cheese (20.72)";
		price = super.getPrice() + 20.72;
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
