package compound.combining.ducks;

/**
 * 橡皮鸭子
 * */
public class RubberDuck implements Quackable {
	private Observable observable;
	
	public RubberDuck() {
		observable = new Observable(this);
	}

	@Override
	/**
	 * 橡皮鸭子发出的声音是“吱吱。。。”
	 * */
	public void quack() {
		System.out.println("Squeak");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
	
	public String toString(){
		return "Rubber-Duck";
	}

}
