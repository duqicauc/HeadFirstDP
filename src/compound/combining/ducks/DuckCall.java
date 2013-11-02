package compound.combining.ducks;

/**
 * 鸭子电话
 * */
public class DuckCall implements Quackable {
	private Observable observable;
	
	public DuckCall() {
		observable = new Observable(this);
	}

	@Override
	/**
	 * 鸭子电话也响，但是声音和真的鸭子不同
	 * */
	public void quack() {
		System.out.println("Kwak");
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
		return "Dduck Call";
	}

}
