package template.simplebarista;

public abstract class CaffeineBeverage {
	public abstract void prepareRecipe();
	
	public void boilWater(){
		System.out.println("Boiling water");
	}
	
	public void pourInCup(){
		System.out.println("Pouring into cup");
	}
}
