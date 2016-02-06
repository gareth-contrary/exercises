package bridge;

public abstract class Car {

	private Product product;
	private String car;
	
	public Car(Product product, String car) {
		this.product = product;
		this.car = car;
	}
	public void produceProduct() {
		System.out.println("Producing " + product.getType());
		System.out.println("Modifying product " + product.getType() + " according to " + car);
	}
	
	public void assemble(){
		System.out.println("Assembling " + product.getType() + " for " + car);
	}
	
	public void printDetails(){
		System.out.println("Car: " + car + " Product: " + product.getType());
	}
}
