package factory.pizzaFramework;

public class NYStyleClamPizza extends Pizza {
	public NYStyleClamPizza() {
		name = "NY Style Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Fresh Clams from Long Island Sound");
	}
	
	public void cut(){
		System.out.println("Cut the pizza into square slices");
	}
}
