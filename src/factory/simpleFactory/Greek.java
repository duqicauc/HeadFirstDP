package factory.simpleFactory;

public class Greek extends Pizza {

	@Override
	public void prepare() {
		System.out.println("prepare Geek pizza");

	}

	@Override
	public void bake() {
		System.out.println("bake the Geek pizza");

	}

	@Override
	public void cut() {
		System.out.println("cut the Geek pizza");

	}

	@Override
	public void box() {
		System.out.println("box the Geek pizza");

	}

}
