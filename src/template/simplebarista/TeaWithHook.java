package template.simplebarista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook {
 
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
	
	public boolean customersWantCondiments() {

		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
 
	private String getUserInput() {
		// get the user's response
		String answer = null;

		System.out.print("Would you like Lemon with your tea (y/n)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}
}
