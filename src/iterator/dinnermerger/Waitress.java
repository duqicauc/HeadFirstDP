package iterator.dinnermerger;

import java.util.ArrayList;

/**
 * Java-Enable Waitress
 * 负责打印各式菜单的类
 * */
public class Waitress {
	private DinnerMenu dinnerMenu;
	private PancakeHouseMenu pancakeHouseMenu;
	/**
	 * @param dinnerMenu
	 * @param pancakeHouseMenu
	 */
	public Waitress(DinnerMenu dinnerMenu, PancakeHouseMenu pancakeHouseMenu) {
		super();
		this.dinnerMenu = dinnerMenu;
		this.pancakeHouseMenu = pancakeHouseMenu;
	}
	/**
	 * prints every item on menu
	 * */
	public void printMenu(){
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
		for (int i = 0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = (MenuItem)breakfastItems.get(i);
			System.out.print(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
		}
		
		DinnerMenu dinnerMenu = new DinnerMenu();
		MenuItem[] lunchItems = dinnerMenu.getMenuItems();
		for (int i = 0; i < lunchItems.length; i++) {
			MenuItem menuItem = lunchItems[i];
			System.out.print(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
		}
	}
}
