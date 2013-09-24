package decorator;


public class Soy extends CondimentDecorator {
	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

//	public int getSize() {
//		return size;
//	}
//	
//	public void setSize(int s){
//		this.size = s;
//	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + Menu.SOY_NAME;
	}

	@Override
	public float cost() {
		float cost = beverage.cost();
		int s = this.getSize();
		if (s == Beverage.TALL) {
			cost += Menu.SOY_PRICE_TALL;
		} else if (s == Beverage.GRANDE) {
			cost += Menu.SOY_PRICE_GRANDE;
		} else if (s == Beverage.VENTI) {
			cost += Menu.SOY_PRICE_VENTI;
		}
		return cost;
	}

}
