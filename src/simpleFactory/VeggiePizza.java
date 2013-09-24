package simpleFactory;

public class VeggiePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("prepare the veggie pizza");
	}

	@Override
	public void bake() {
		System.out.println("bake the veggie pizza");

	}

	@Override
	public void cut() {
		System.out.println("cut the veggie pizza");

	}

	@Override
	public void box() {
		System.out.println("box the veggie pizza");

	}

}
