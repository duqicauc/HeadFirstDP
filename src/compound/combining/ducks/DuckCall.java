package compound.combining.ducks;

/**
 * 鸭子电话
 * */
public class DuckCall implements Quackable {

	@Override
	/**
	 * 鸭子电话也响，但是声音和真的鸭子不同
	 * */
	public void quack() {
		System.out.println("Kwak");
	}

}
