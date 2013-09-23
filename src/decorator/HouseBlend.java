package decorator;

public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		description = Menu.HOUSEBLEND_NAME;
	}

	@Override
	public float cost() {
		return Menu.HOUSEBLEND_PRICE;
	}

}
