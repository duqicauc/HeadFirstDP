package simpleFactory;

public class PizzaStore {
	private SimpleFactory pizzaFactory = new SimpleFactory();
	
	/**
	 * 根据客户要求的类型定制不同种类的披萨
	 * */
	public Pizza orderPizza(String type) {
		// 由SimpleFactory制作各种类型的披萨
		Pizza pizza = pizzaFactory.createPizza(type);
		// 披萨出货前的几项工作
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
		
	}
	
	//other methods here
	//披萨店的其他接口函数，注意接口的抽象层次要一致

}
