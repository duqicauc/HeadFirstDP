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
		float cost = beverage.cost();
		int whipSize = getSize();
		if (whipSize == Beverage.TALL) {
			cost += Menu.WHIP_PRICE_TALL;
		} else if (whipSize == Beverage.GRANDE) {
			cost += Menu.WHIP_PRICE_GRANDE;
		} else if (whipSize == Beverage.VENTI){
			cost += Menu.WHIP_PRICE_VENTI;
		}
		return cost;
	}

}
