package longFormQuestions;
public class Ham extends PizzaDecorator {

	private String desc;
	private double price;
	
	public Ham(Pizza pizza) {
		super(pizza);
		desc = super.getDesc() + ", Ham (18.12)";
		price = super.getPrice() + 18.12;
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
