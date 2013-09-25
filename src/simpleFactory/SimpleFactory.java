package simpleFactory;

/**
 * 原则：将经常发生变化的备份分离出来，并封装之
 * */
public class SimpleFactory {
	public Pizza createPizza(String type){
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
		return pizza;
	}
}
