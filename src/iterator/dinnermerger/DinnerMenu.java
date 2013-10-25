package iterator.dinnermerger;

import java.util.Iterator;

/**
 * Dinner House的菜单类DinnerMenu
 * */
public class DinnerMenu implements Menu{
	private static final int MAX_ITEMS = 6;	//菜单项最大个数
	private int numberOfItems = 0;			//当前存放的个数
	private MenuItem[] menuItems;			//菜单项数组
	
	public DinnerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat",
				true, 2.99);
		addItem("BLT", "Bacon with letture & tomato on whole wheat", 
				false, 2.99);
		addItem("Soup of the day", "Soup of the day, with a side of potato salad", 
				false, 3.29);
		addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", 
				false, 3.05);
		// a couple of other Dinner Menu items added here
	}
	
	public void addItem(String name, String description,
			boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.out.println("Sorry, menu is full! Can't add item to the menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems += 1;
		}
	}
	
//	public MenuItem[] getMenuItems(){
//		return menuItems;
//	}
	
	public Iterator createIterator(){
		//return new DinnerMenuIterator(menuItems);
		return new AlterDinnerMenuIterator(menuItems);
	}
	
	// other menu methods here
	// Like Lou,Mel has a bunch of code that depends on the implementation
	// of his menu being an Array.
}
