package decorator;

public class Mocha extends CondimentDecorator {
	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + Menu.MOCHA_NAME;
	}

	@Override
	public float cost() {
		return beverage.cost() + Menu.MOCHA_PRICE;
	}

}
