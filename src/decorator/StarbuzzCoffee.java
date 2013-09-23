package decorator;

public class StarbuzzCoffee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription()+":"+espresso.cost());
		
		Beverage houseBlendWithMilk = new HouseBlend();
		houseBlendWithMilk = new Milk(houseBlendWithMilk);
		houseBlendWithMilk = new Mocha(houseBlendWithMilk);
		houseBlendWithMilk = new Milk(houseBlendWithMilk);
		System.out.println(houseBlendWithMilk.getDescription()+":"+houseBlendWithMilk.cost());

	}

}
