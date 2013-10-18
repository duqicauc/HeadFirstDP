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
		ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
		for (int i = 0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = (MenuItem)breakfastItems.get(i);
			System.out.print(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
		}
		
//		MenuItem[] lunchItems = dinnerMenu.getMenuItems();
//		for (int i = 0; i < lunchItems.length; i++) {
//			MenuItem menuItem = lunchItems[i];
//			System.out.print(menuItem.getName() + " ");
//			System.out.println(menuItem.getPrice() + " ");
//			System.out.println(menuItem.getDescription());
//		}
		Iterator dinnerIterator = dinnerMenu.createIterator();
		while (dinnerIterator.hasNext()) {
			MenuItem menuItem = (MenuItem)dinnerIterator.next();
			System.out.print(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
		}
	}
	/**
	 * prints just breakfast items
	 * */
	public void printBreakfastMenu(){
		//PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
		for (int i = 0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = (MenuItem)breakfastItems.get(i);
			System.out.print(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
		}
	}
	/**
	 * prints just lunch items
	 * */
	public void printLunchMenu(){
//		MenuItem[] lunchItems = dinnerMenu.getMenuItems();
//		for (int i = 0; i < lunchItems.length; i++) {
//			MenuItem menuItem = lunchItems[i];
//			System.out.print(menuItem.getName() + " ");
//			System.out.println(menuItem.getPrice() + " ");
//			System.out.println(menuItem.getDescription());
//		}
		Iterator dinnerIterator = dinnerMenu.createIterator();
		while (dinnerIterator.hasNext()) {
			MenuItem menuItem = (MenuItem) dinnerIterator.next();
			System.out.print(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
		}
	}
	
	/**
	 * prints all vegetarian menu items
	 * */
	public void printVegetarianMenu(){
		//PancakeHouseMenu pancakeHouseMenu =  new PancakeHouseMenu();
		ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
		for (int i = 0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = (MenuItem)breakfastItems.get(i);
			if (isItemVegetarian(menuItem)) {
				System.out.print(menuItem.getName() + " ");
				System.out.println(menuItem.getPrice() + " ");
				System.out.println(menuItem.getDescription());
			}
		}
		Iterator dinnerIterator = dinnerMenu.createIterator();
		while (dinnerIterator.hasNext()) {
			MenuItem menuItem = (MenuItem) dinnerIterator.next();
			if (isItemVegetarian(menuItem)) {
				System.out.print(menuItem.getName() + " ");
				System.out.println(menuItem.getPrice() + " ");
				System.out.println(menuItem.getDescription());
			}
		}
	}
	
	/**
	 * given the name of an item, returns true
	 * if the items is vegetarian, otherwise,
	 * return false
	 * */
	public boolean isItemVegetarian(MenuItem menuItem) {
		return menuItem.isVegetarian();
	}
}
