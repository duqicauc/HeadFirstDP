package iterator.dinnermerger;

public class MenuTestDrive {
	public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinerMenu = new DinnerMenu();
 
		Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);
 
		waitress.printMenu();
		//waitress.printBreakfastMenu();
		//waitress.printVegetarianMenu();
	}
}
