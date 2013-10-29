package composite.menu;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
	private String	name;
	private String	description;
	private boolean vegetarian;
	private double 	price;
	private Iterator iterator = null;
	/**
	 * @param name
	 * @param description
	 * @param vegetarian
	 * @param price
	 */
	public MenuItem(String name, String description, boolean vegetarian,
			double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @return the vegetarian
	 */
	public boolean isVegetarian() {
		return vegetarian;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * 在MenuComponent中有默认实现
	 * 在这里针对MenuItem实现属于它自己特点的print函数
	 * */
	public void print(){
		System.out.print("  " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("     -- " + getDescription());
	}
	@Override
	public Iterator createIterator() {
		return new NullIterator();
	}
}
