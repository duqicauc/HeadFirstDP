package simpleFactory;

public class PizzStore {

	public Pizza orderPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("greek")) {
			pizza = new Greek();
		} else if (type.equals("peperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
		
	}
	
	//other methods here
	//属于Pizza店的其他方法也在这个类中，注意接口的抽象层次要一致

}
