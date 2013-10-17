package template.simplebarista;

public class Barista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\nMaking coffee...");
		CoffeWithHook coffe = new CoffeWithHook();
		coffe.prepareRecipe();
		
		System.out.println("\nMaking tea...");
		TeaWithHook tea = new TeaWithHook();
		tea.prepareRecipe();

	}

}
