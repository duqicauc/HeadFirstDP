package factory.pizzaFramework;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYStylePizzaStore();
		
		Pizza pizza = nyPizzaStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		nyPizzaStore.orderPizza("greek");
		System.out.println("duqi ordered a " + pizza.getName() + "\n");
		nyPizzaStore.orderPizza("clam");
		System.out.println("liuman order a " + pizza.getName() + "\n");
		nyPizzaStore.orderPizza("veggie");
		System.out.println("wanlin order a " + pizza.getName() + "\n");
		
		
	}

}
