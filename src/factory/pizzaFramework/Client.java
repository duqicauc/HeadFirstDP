package factory.pizzaFramework;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYStylePizzaStore();
		Pizza pizza = nyPizzaStore.createPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
	}

}
