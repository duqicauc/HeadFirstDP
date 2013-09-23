package decorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = Menu.DARKROAST_NAME;
	}

	@Override
	public float cost() {

		return Menu.DARKROAST_PRICE;
	}

}
