package factory.simpleFactory;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore();
		Pizza pizza = pizzaStore.orderPizza("veggie");

	}

}
