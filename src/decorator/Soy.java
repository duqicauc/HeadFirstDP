package decorator;

public class Soy extends CondimentDecorator {
	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public int getSize() {
		return size;
	}
	
	public void setSize(int s){
		this.size = s;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + Menu.SOY_NAME;
	}

	@Override
	public float cost() {
		float cost = beverage.cost();
		int s = this.getSize();
		if (s == Beverage.TALL) {
			cost += 0.10f;
		} else if (s == Beverage.GRANDE) {
			cost += 0.15f;
		} else if (s == Beverage.VENTI) {
			cost += 0.20f;
		}
		return cost;
	}

}
