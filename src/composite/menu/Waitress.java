package composite.menu;

import java.util.Iterator;

public class Waitress {
	private MenuComponent allMenus;

	/**
	 * @param allMenus
	 */
	public Waitress(MenuComponent allMenus) {
		super();
		this.allMenus = allMenus;
	}
	
	public void printMenu(){
		allMenus.print();
	}
	
	public void printVegetarianMenu() {
		Iterator iterator = allMenus.createIterator();
		System.out.println("\nVEGETARIAN MENU\n----");
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			// 自己写的方法中的抛出异常，那么在使用该方法的客户代码中要做相应的处理，即try/catch块
			try {
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {
				
			}
		}
	}
		
}
