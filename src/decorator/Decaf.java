package decorator;

public class Decaf extends Beverage{

	public Decaf() {
		description = Menu.DECAF_NAME;
	}
	
	@Override
	public float cost() {
		float cost = 0.0f;
		int decafSize = getSize();
		if (decafSize == Beverage.TALL) {
			cost = Menu.DECAF_PRICE_TALL;
		} else if (decafSize == Beverage.GRANDE) {
			cost = Menu.DECAF_PRICE_GRANDE;
		} else if (decafSize == Beverage.VENTI){
			cost = Menu.DECAF_PRICE_VENTI;
		}
		return cost;
	}

}
