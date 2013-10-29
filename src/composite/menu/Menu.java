package composite.menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * composite类，可以包含MenuItems或者其他的Menus
 * */
public class Menu extends MenuComponent {
	private ArrayList menuComponents = new ArrayList(); //管理类型为MenuComponent的孩子节点
	private String name;
	private String description;
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public void add(MenuComponent menuComponent){
		menuComponents.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent){
		menuComponents.remove(menuComponent);
	}
	
	public MenuComponent getChild(int i){
		return (MenuComponent) menuComponents.get(i);
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void print(){
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
		
		Iterator iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			// 递归：如果在本次迭代时，遇到另一个Menu对象，那么它的print函数将会开始执行另一次print
			menuComponent.print();
		}
	}
}
