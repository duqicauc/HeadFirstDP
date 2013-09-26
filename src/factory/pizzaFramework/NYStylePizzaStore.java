package factory.pizzaFramework;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		} else if (type.equals("greek")) {
			pizza = new NYStyleGreekPizza();
		} else if (type.equals("clam")) {
			pizza = new NYStyleClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new NYStyleVeggiePizza();
		}
		return pizza;
	}

}
