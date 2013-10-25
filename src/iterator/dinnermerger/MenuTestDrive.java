package iterator.dinnermerger;

public class MenuTestDrive {
	public static void main(String args[]) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinnerMenu();
        Menu cafeMenu = new CafeMenu();
 
		Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu, cafeMenu);
 
		//waitress.printMenu();
		//waitress.printBreakfastMenu();
		//waitress.printVegetarianMenu();
		waitress.printLunchMenu();
	}
}
