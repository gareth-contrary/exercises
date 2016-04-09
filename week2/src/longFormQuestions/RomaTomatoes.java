package longFormQuestions;

public class RomaTomatoes extends PizzaDecorator {

	private String desc;
	private double price;

	public RomaTomatoes(Pizza pizza) {
		super(pizza);
		desc = super.getDesc() + ", Roma Tomatoes (5.20)";
		price = super.getPrice() + 5.20;
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
