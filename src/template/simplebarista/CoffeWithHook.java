package template.simplebarista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * 负责制作咖啡的类
 * */
public class CoffeWithHook extends CaffeineBeverageWithHook{
//	/**
//	 * 咖啡食谱
//	 * */
//	public void prepareRecipe(){
//		boilWater();
//		brewCoffeeGrinds();
//		pourInCup();
//		addSugarAndMilk();
//	}
	
//	public void boilWater() {
//		System.out.println("Boiling water");
//	}
	
	public void brew(){
		System.out.println("Dripping Coffee through filter");
	}
	
//	public void pourInCup() {
//		System.out.println("Pouring into cup");
//	}
	
	public void addCondiments(){
		System.out.println("Adding Suggar and Milk");
	}
	
	public boolean customersWantCondiments(){
		String userAnswer = getUserInput();
		if (userAnswer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getUserInput(){
		String answer = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Would you like milk and suger with your coffee?(y/n)");
        try {
            answer = in.readLine();
        } catch (IOException ex) {
           System.out.println("IO error trying to read your answer");
        }
        if (answer == null) {
			return "no";
		}
        return answer;
	}
}
