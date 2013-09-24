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
		float cost = beverage.cost();
		int milkSize = getSize();
		if (milkSize == Beverage.TALL) {
			cost += Menu.MILK_PRICE_TALL;
		}else if (milkSize == Beverage.GRANDE) {
			cost += Menu.MILK_PRICE_GRANDE;
		}else if (milkSize == Beverage.VENTI) {
			cost += Menu.MILK_PRICE_VENTI;
		}
		return cost;
	}

}
