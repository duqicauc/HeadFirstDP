package compound.combining.ducks;

/**
 * 橡皮鸭子
 * */
public class RubberDuck implements Quackable {

	@Override
	/**
	 * 橡皮鸭子发出的声音是“吱吱。。。”
	 * */
	public void quack() {
		System.out.println("Squeak");
	}

}
