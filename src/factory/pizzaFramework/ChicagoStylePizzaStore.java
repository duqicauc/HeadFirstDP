package factory.pizzaFramework;

public class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals(Pizza.CHEESE)) {
			pizza = new ChicagoStyleCheesePizza();
		} else if (type.equals(Pizza.CLAM)) {
			pizza = new ChicagoStyleClamPizza();
		} else if (type.equals(Pizza.GREEK)) {
			pizza = new ChicagoStyleGreekPizza();
		} else if (type.equals(Pizza.VEGGIE)) {
			pizza = new ChicagoStyleVeggiePizza();
		}
		return pizza;
	}

}
