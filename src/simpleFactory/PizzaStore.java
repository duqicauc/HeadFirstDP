package simpleFactory;

public class PizzaStore {

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
	//灞炰簬Pizza搴楃殑鍏朵粬鏂规硶涔熷湪杩欎釜绫讳腑锛屾敞鎰忔帴鍙ｇ殑鎶借薄灞傛瑕佷竴鑷�

}
