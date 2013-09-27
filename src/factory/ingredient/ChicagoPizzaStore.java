package factory.ingredient;

public class ChicagoPizzaStore extends PizzaStore {
	PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
	Pizza pizza = null;

	@Override
	protected Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("Chicago style cheese pizza");
		} else if(item.equals("veggie")){
			pizza = new VeggiePizza(pizzaIngredientFactory);
			pizza.setName("Chicago style veggie pizza");
		} else if (item.equals("clam")) {
			pizza = new ClamPizza(pizzaIngredientFactory);
			pizza.setName("Chicago style clam pizza");
		} else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(pizzaIngredientFactory);
			pizza.setName("Chicago style pepperoni pizza");
		}
		return pizza;
	}

}
