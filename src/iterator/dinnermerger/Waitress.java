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
//		ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
//		for (int i = 0; i < breakfastItems.size(); i++) {
//			MenuItem menuItem = (MenuItem)breakfastItems.get(i);
//			System.out.print(menuItem.getName() + " ");
//			System.out.println(menuItem.getPrice() + " ");
//			System.out.println(menuItem.getDescription());
//		}
		Iterator breakfastIterator = pancakeHouseMenu.createIterator();
		System.out.println("打印出breakfast菜单。。。。");
		printMenu(breakfastIterator);
//		MenuItem[] lunchItems = dinnerMenu.getMenuItems();
//		for (int i = 0; i < lunchItems.length; i++) {
//			MenuItem menuItem = lunchItems[i];
//			System.out.print(menuItem.getName() + " ");
//			System.out.println(menuItem.getPrice() + " ");
//			System.out.println(menuItem.getDescription());
//		}
		Iterator dinnerIterator = dinnerMenu.createIterator();
		System.out.println("打印出lunch菜单。。。。");
		printMenu(dinnerIterator);
	}
	/**
	 * prints just breakfast items
	 * */
	public void printBreakfastMenu(){
		//PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
//		ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
//		for (int i = 0; i < breakfastItems.size(); i++) {
//			MenuItem menuItem = (MenuItem)breakfastItems.get(i);
//			System.out.print(menuItem.getName() + " ");
//			System.out.println(menuItem.getPrice() + " ");
//			System.out.println(menuItem.getDescription());
//		}
		Iterator breakfastIterator = pancakeHouseMenu.createIterator();
		System.out.println("打印出breakfast菜单。。。。");
		printMenu(breakfastIterator);
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
		System.out.println("打印出lunch菜单。。。。");
		printMenu(dinnerIterator);
	}
	
	/**
	 * prints all vegetarian menu items
	 * */
	public void printVegetarianMenu(){
		//PancakeHouseMenu pancakeHouseMenu =  new PancakeHouseMenu();
//		ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
//		for (int i = 0; i < breakfastItems.size(); i++) {
//			MenuItem menuItem = (MenuItem)breakfastItems.get(i);
//			if (isItemVegetarian(menuItem)) {
//				System.out.print(menuItem.getName() + " ");
//				System.out.println(menuItem.getPrice() + " ");
//				System.out.println(menuItem.getDescription());
//			}
//		}
		printVegetrian(pancakeHouseMenu.createIterator());
		printVegetrian(dinnerMenu.createIterator());
	}
	
	/**
	 * printVegetrianMenu
	 * */
	private void printVegetrian(Iterator iterator){
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			if (isItemVegetarian(menuItem)) {
				System.out.print(menuItem.getName() + " ");
				System.out.println(menuItem.getPrice());
				System.out.println(menuItem.getDescription());
			}
		}
	}
	
	/**
	 * printMenu
	 * */
	
	private void printMenu(Iterator iterator){
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.print(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
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
