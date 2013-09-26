package factory.pizzaFramework;

import java.util.ArrayList;

public abstract class Pizza {
	protected String name;	//披萨名字
	protected String dough;	//面团
	protected String sauce;	//酱油
	//披萨顶部的装饰食品
	protected ArrayList<String> toppings = new ArrayList<String>();
	
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings...");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("   " + toppings.get(i));
		}
	}
	
	public void bake(){
		System.out.println("Bake for 25minutes at 350");
	}
	
	public void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box(){
		System.out.println("Place the pizza in the offical PizzaStore box");
	}
	
	public String getName(){
		return name;
	}
}
