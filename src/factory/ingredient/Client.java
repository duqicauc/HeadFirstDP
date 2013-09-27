package factory.ingredient;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pizza pizza = null;
		PizzaStore pizzStore1 = new NYPizzaStore();
		pizza = pizzStore1.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		pizza = pizzStore1.orderPizza("veggie");
		System.out.println("duqi ordered a " + pizza.getName() + "\n");
		
		
		PizzaStore pizzStore2 = new ChicagoPizzaStore();
		pizza = pizzStore2.orderPizza("clam");;
		System.out.println("david ordered a " + pizza.getName() + "\n");
		pizza = pizzStore2.orderPizza("pepperoni");
		System.out.println("Lisa ordered a " + pizza.getName() + "\n");

	}

}
