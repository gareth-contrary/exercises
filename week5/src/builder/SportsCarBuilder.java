package builder;

public class SportsCarBuilder implements CarBuilder {

	private Car car;
	
	public SportsCarBuilder() {
		this.car = new Car("SPORTS");
	}
	
	@Override
	public void buildBodyStyle() {
		car.setBodyStyle("");
	}

	@Override
	public void buildPower() {
		car.setPower("");
	}

	@Override
	public void buildEngine() {
		car.setEngine("");
	}

	@Override
	public void buildBreaks() {
		car.setBreaks("");
	}

	@Override
	public void buildSeats() {
		car.setSeats("");
	}

	@Override
	public void buildWindows() {
		car.setWindows("");
	}

	@Override
	public void buildFuelType() {
		car.setFuelType("");
	}

	@Override
	public Car getCar() {
		return this.car;
	}


}
