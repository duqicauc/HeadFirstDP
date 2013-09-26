package factory.ingredient;

public interface PizzaIngredientFactory {
	// 为每一个原料定义一个“工厂方法”
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
