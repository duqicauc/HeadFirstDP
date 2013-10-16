package template.simplebarista;

public class Tea extends CaffeineBeverage {
 
//	public void prepareRecipe() {
//		boilWater();
//		steepTeaBag();
//		pourInCup();
//		addLemon();
//	}
 
//	public void boilWater() {
//		System.out.println("Boiling water");
//	}
 
	public void brew() {
		System.out.println("Steeping the tea");
	}
 
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
 
//	public void pourInCup() {
//		System.out.println("Pouring into cup");
//	}
}
