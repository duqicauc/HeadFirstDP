package simpleFactory;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzStore pizzaStore = new PizzStore();
		Pizza pizza = pizzaStore.orderPizza("cheese");

	}

}
