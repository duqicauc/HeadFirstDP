package factory.pizzaFramework;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* 测试NewYork Style */
		System.out.println("-----------测试NewYork Style-------------");
		PizzaStore nyPizzaStore = new NYStylePizzaStore();
		Pizza pizza = nyPizzaStore.orderPizza(Pizza.CHEESE);
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		nyPizzaStore.orderPizza(Pizza.GREEK);
		System.out.println("duqi ordered a " + pizza.getName() + "\n");
		nyPizzaStore.orderPizza(Pizza.CLAM);
		System.out.println("liuman order a " + pizza.getName() + "\n");
		nyPizzaStore.orderPizza(Pizza.VEGGIE);
		System.out.println("wanlin order a " + pizza.getName() + "\n");
		
		/* 测试Chicago Style */
		System.out.println("-----------测试Chicago Style-------------");
		PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
		Pizza pizza2 = chicagoPizzaStore.orderPizza(Pizza.CHEESE);
		System.out.println("Ethan ordered a " + pizza2.getName() + "\n");
		pizza2 = chicagoPizzaStore.orderPizza(Pizza.GREEK);
		System.out.println("Ethan ordered a " + pizza2.getName() + "\n");
		
		
	}

}
