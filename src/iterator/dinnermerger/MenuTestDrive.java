package iterator.dinnermerger;

public class MenuTestDrive {
	public static void main(String args[]) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinnerMenu();
 
		Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);
 
		waitress.printMenu();
		//waitress.printBreakfastMenu();
		//waitress.printVegetarianMenu();
	}
}
