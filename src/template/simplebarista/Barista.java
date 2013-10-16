package template.simplebarista;

public class Barista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Making coffee...");
		Coffe coffe = new Coffe();
		coffe.prepareRecipe();
		System.out.println("Making tea...");
		Tea tea = new Tea();
		tea.prepareRecipe();

	}

}
