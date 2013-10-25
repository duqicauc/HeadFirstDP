package iterator.dinnermerger;

import java.util.Iterator;
import java.util.Hashtable;

public class CafeMenu implements Menu {
	private Hashtable menuItems = new Hashtable();

	public CafeMenu() {
		addItem("Veggie Burger and Air Fires", 
				"Veggie burger on a whole wheat bun, lettuce, tomatio, and fries",
				true, 3.99);
		addItem("Soup of the day", 
				"A cup of the soup of the day, with a side salad",
				false, 3.69);
		addItem("Burrito", 
				"A large burrito, with whole pinto beans, salsa, guacamole",
				true, 4.29);
	}

	public void addItem(String name, String description, boolean vegetarian,
			double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);//key就是对象的名字，value就是对象的引用地址
	}

	@Override
	public Iterator createIterator() {
		// 注意：我们不是针对整个hash表获取迭代器，而仅仅是针对values集合
		return menuItems.values().iterator();
	}

}
