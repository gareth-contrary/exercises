package longFormQuestions;

public class Spinach extends PizzaDecorator {

	private String desc;
	private double price;
	
	public Spinach(Pizza pizza) {
		super(pizza);
		desc = super.getDesc() + ", Spinach (7.92)";
		price = super.getPrice() + 7.92;
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
