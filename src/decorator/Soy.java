package decorator;

public class Soy extends CondimentDecorator {
	private Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + Menu.SOY_NAME;
	}

	@Override
	public float cost() {
		return beverage.cost() + Menu.SOY_PRICE;
	}

}
