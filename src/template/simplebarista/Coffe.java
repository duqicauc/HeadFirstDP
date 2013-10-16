package template.simplebarista;

/**
 * 负责制作咖啡的类
 * */
public class Coffe {
	/**
	 * 咖啡食谱
	 * */
	void prepareRecipe(){
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}
	
	public void boilWater() {
		System.out.println("Boiling water");
	}
	
	public void brewCoffeeGrinds(){
		System.out.println("Dripping Coffee through filter");
	}
	
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	public void addSugarAndMilk(){
		System.out.println("Adding Suggar and Milk");
	}
}
