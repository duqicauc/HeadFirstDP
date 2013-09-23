package decorator;

public class Milk extends CondimentDecorator {
	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + Menu.MILK_NAME;
	}

	@Override
	public float cost() {
		return beverage.cost() + Menu.MILK_PRICE;
	}

}
