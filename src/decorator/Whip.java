package decorator;

public class Whip extends CondimentDecorator {
	private Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + Menu.WHIP_NAME;
	}

	@Override
	public float cost() {
		return beverage.cost() + Menu.WHIP_PRICE;
	}

}
