package factory.ingredient;

public class NYPizzaStore extends PizzaStore {
	Pizza pizza = null;
	PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

	@Override
	protected Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("New York style cheese pizza");
		} else if(item.equals("veggie")){
			pizza = new VeggiePizza(pizzaIngredientFactory);
			pizza.setName("New York style veggie pizza");
		} else if (item.equals("clam")) {
			pizza = new ClamPizza(pizzaIngredientFactory);
			pizza.setName("New York style clam pizza");
		} else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(pizzaIngredientFactory);
			pizza.setName("New York style pepperoni pizza");
		}
		return pizza;
	}

}
