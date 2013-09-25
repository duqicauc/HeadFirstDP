package factory.simpleFactory;

public class ClamPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("prepare the clam pizza");

	}

	@Override
	public void bake() {
		System.out.println("bake the clam pizza");

	}

	@Override
	public void cut() {
		System.out.println("cut the clam pizza");

	}

	@Override
	public void box() {
		System.out.println("box the clam pizza");

	}

}
