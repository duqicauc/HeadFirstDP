package factory.simpleFactory;

public class PepperoniPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("prepare the pepperoni pizza");

	}

	@Override
	public void bake() {
		System.out.println("bake the pepperoni pizza");

	}

	@Override
	public void cut() {
		System.out.println("cut the pepperoni pizza");

	}

	@Override
	public void box() {
		System.out.println("box the pepperoni pizza");

	}

}
