package iterator.dinnermerger;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Java-Enable Waitress
 * 负责打印各式菜单的类
 * */
public class Waitress {
	private Menu dinnerMenu;
	private Menu pancakeHouseMenu;
	private Menu cafeMenu;
	/**
	 * @param dinnerMenu
	 * @param pancakeHouseMenu
	 */
	public Waitress(Menu dinnerMenu, Menu pancakeHouseMenu, Menu cafeMenu) {
		super();
		this.dinnerMenu = dinnerMenu;
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.cafeMenu = cafeMenu;
	}
	/**
	 * prints every item on menu
	 * */
	public void printMenu(){
		Iterator breakfastIterator = pancakeHouseMenu.createIterator();
		System.out.println("MENU\n----\n打印出breakfast菜单。。。。");
		printMenu(breakfastIterator);
		Iterator dinnerIterator = (Iterator) dinnerMenu.createIterator();
		System.out.println("\n打印出lunch菜单。。。。");
		printMenu(dinnerIterator);
		Iterator cafeIterator = cafeMenu.createIterator();
		System.out.println("\n打印出cafe菜单。。。。");
		printMenu(cafeIterator);
	}
	/**
	 * prints just breakfast items
	 * */
	public void printBreakfastMenu(){
		Iterator breakfastIterator = pancakeHouseMenu.createIterator();
		System.out.println("打印出breakfast菜单。。。。");
		printMenu(breakfastIterator);
	}
	/**
	 * prints just lunch items
	 * */
	public void printLunchMenu(){
		Iterator dinnerIterator = (Iterator) dinnerMenu.createIterator();
		System.out.println("打印出lunch菜单。。。。");
		printMenu(dinnerIterator);
	}
	
	/**
	 * prints all vegetarian menu items
	 * */
	public void printVegetarianMenu(){
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
