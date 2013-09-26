package factory.pizzaFramework;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYStylePizzaStore();
		
		Pizza pizza = nyPizzaStore.orderPizza(Pizza.CHEESE);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		nyPizzaStore.orderPizza(Pizza.GREEK);
		System.out.println("duqi ordered a " + pizza.getName() + "\n");
		nyPizzaStore.orderPizza(Pizza.CLAM);
		System.out.println("liuman order a " + pizza.getName() + "\n");
		nyPizzaStore.orderPizza(Pizza.VEGGIE);
		System.out.println("wanlin order a " + pizza.getName() + "\n");
		
		
	}

}
