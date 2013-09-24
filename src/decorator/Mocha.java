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
		float cost = beverage.cost();
		int mochaSize = getSize();
		if (mochaSize == Beverage.TALL) {
			cost += Menu.MOCHA_PRICE_TALL;
		} else if (mochaSize == Beverage.GRANDE) {
			cost += Menu.MOCHA_PRICE_GRANDE;
		} else if (mochaSize == Beverage.VENTI) {
			cost += Menu.MOCAH_PRICE_VENTI;
		}
		return cost;
	}

}
