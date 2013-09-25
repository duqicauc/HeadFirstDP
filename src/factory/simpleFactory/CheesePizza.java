package factory.simpleFactory;

public class CheesePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("prepare cheese pizza.");

	}

	@Override
	public void bake() {
		System.out.println("bake the cheese pizza.");

	}

	@Override
	public void cut() {
		System.out.println("cut the cheese pizza.");

	}

	@Override
	public void box() {
		System.out.println("box the cheese pizza");

	}

}
