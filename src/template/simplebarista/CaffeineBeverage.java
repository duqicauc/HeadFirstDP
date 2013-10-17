package template.simplebarista;

public abstract class CaffeineBeverage {
	public final void prepareRecipe(){
		boilWater();
		brew();//由子类负责具体实现
		pourInCup();
		if (customersWantCondiments()) {
			addCondiments();
		}
	}
	
	public abstract void brew();//将Coffee和Tea中的brewCoffeeGrinds和steepTeaBag提炼为冲泡（brew）这个动作
	public abstract void addCondiments();//在Coffee和Tea中都是添加材料两个动作，也抽象出来
	
	public void boilWater(){
		System.out.println("Boiling water");
	}
	
	public void pourInCup(){
		System.out.println("Pouring into cup");
	}
	
	/**
	 * This is hook because the subclass can override
	 * the method, but doesn't have to.
	 * */
	public boolean customersWantCondiments(){
		return true;
	}
}
