package decorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = Menu.DARKROAST_NAME;
	}

	@Override
	public float cost() {
		float cost = 0.0f;
		int darkRoastSize = getSize();
		if (darkRoastSize == Beverage.TALL) {
			cost = Menu.DARKROAST_PRICE_TALL;
		} else if (darkRoastSize == Beverage.GRANDE) {
			cost = Menu.DARKROAST_PRICE_GRANDE;
		} else if (darkRoastSize == Beverage.VENTI) {
			cost = Menu.DARKROAST_PRICE_VENTI;
		}
		
		return cost;
	}

}
