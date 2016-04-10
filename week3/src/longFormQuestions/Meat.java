package longFormQuestions;

public class Meat extends PizzaDecorator {

	private String desc;
	private double price;
	
	public Meat(Pizza pizza) {
		super(pizza);
		desc = super.getDesc() + ", Meat (14.25)";
		price = super.getPrice() + 14.25;
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
