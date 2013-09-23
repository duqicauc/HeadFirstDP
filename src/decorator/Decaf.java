package decorator;

public class Decaf extends Beverage{

	public Decaf() {
		description = Menu.DECAF_NAME;
	}
	
	@Override
	public float cost() {
		return Menu.DECAF_PRICE;
	}

}
