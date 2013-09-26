package factory.pizzaFramework;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals(Pizza.CHEESE)) {
			pizza = new NYStyleCheesePizza();
		} else if (type.equals(Pizza.GREEK)) {
			pizza = new NYStyleGreekPizza();
		} else if (type.equals(Pizza.CLAM)) {
			pizza = new NYStyleClamPizza();
		} else if (type.equals(Pizza.VEGGIE)) {
			pizza = new NYStyleVeggiePizza();
		}
		return pizza;
	}

}
