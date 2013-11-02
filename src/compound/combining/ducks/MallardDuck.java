package compound.combining.ducks;

/**
 * 野鸭子
 * */
public class MallardDuck implements Quackable {
	private Observable observable;
	
	public MallardDuck() {
		observable = new Observable(this);//将本对象的引用传递给辅助对象
	}

	@Override
	public void quack() {
		System.out.println("Quack");
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

}
