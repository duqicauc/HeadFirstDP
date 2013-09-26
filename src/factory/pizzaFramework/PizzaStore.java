package factory.pizzaFramework;

public abstract class PizzaStore {
	
	protected abstract Pizza createPizza(String type);
	
	/**
	 * 根据客户要求的类型定制不同种类的披萨
	 * */
	// final关键字确保该函数不被子类覆盖
	public final Pizza orderPizza(String type) {
		// 创建函数createPizza现在不是通过一个工厂对象来调用,而改为调用本类中的一个函数
		Pizza pizza = createPizza(type);
		// 披萨出货前的几项工作
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
		
	}

}
