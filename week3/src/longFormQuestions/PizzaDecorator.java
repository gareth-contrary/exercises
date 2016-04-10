package longFormQuestions;

public abstract class PizzaDecorator implements Pizza {

	private Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDesc() {
		return pizza.getDesc();
	}

	public double getPrice() {
		return pizza.getPrice();
	}

}
