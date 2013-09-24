package decorator;

public class Espresso extends Beverage {

	public Espresso() {
		description = Menu.ESPRESSO_NAME;
	}
	
	@Override
	public float cost() {
		float cost = 0.0f;
		int espressoSize = getSize();
		if (espressoSize == Beverage.TALL) {
			cost = Menu.ESPRESSO_PRICE_TALL;
		} else if (espressoSize == Beverage.GRANDE) {
			cost = Menu.ESPRESSO_PRICE_GRANDE;
		} else if (espressoSize == Beverage.VENTI){
			cost = Menu.ESPRESSO_PRICE_VENTI;
		}
		return cost;
	}

}
