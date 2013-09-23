package decorator;

public class Espresso extends Beverage {

	public Espresso() {
		description = Menu.ESPRESSO_NAME;
	}
	
	@Override
	public float cost() {
		return Menu.ESPRESSO_PRICE;
	}

}
