package simpleFactory;

public class PizzStore {
	
	public Pizza orderPizza(String type){
		Pizza pizza;
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("greek")) {
			
		} else if (type.equals("peperoni")) {
			
		}
		return null;
	}

}
