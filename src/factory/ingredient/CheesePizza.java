package factory.ingredient;

public class CheesePizza extends Pizza {
	private PizzaIngredientFactory pizzaIngredientFactory;

	@Override
	protected void prepare() {
		System.out.println("Preparing " + name);
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();
	}
	
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

}
