package strategy.sorts;

public class ClientTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context = new Context(new QuickSort());
		context.sort();
	}

}
