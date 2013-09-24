package decorator;

public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		description = Menu.HOUSEBLEND_NAME;
	}

	@Override
	public float cost() {
		float cost = 0.0f;
		float houseblendSize = getSize();
		if (houseblendSize == Beverage.TALL) {
			cost = Menu.HOUSEBLEND_PRICE_TALL;
		} else if(houseblendSize == Beverage.GRANDE) {
			cost = Menu.HOUSEBLEND_PRICE_GRANDE;
		} else if (houseblendSize == Beverage.VENTI) {
			cost = Menu.HOUSEBLEND_PRICE_VENTI;
		}
		return cost;
	}

}
