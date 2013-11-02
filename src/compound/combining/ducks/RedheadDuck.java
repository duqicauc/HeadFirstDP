package compound.combining.ducks;

public class RedheadDuck implements Quackable {
	private Observable observable;
	
	public RedheadDuck() {
		// 注意让自己的助理对象完成本来应该自己做的事情的方法
		// 助理对象要实现同样的方法，并且做实际工作，本对象只负责将传递权限和调用
		// 相当于经理对象和助理对象都持有双方的引用并实现了同样的方法，助理对象帮助经理对象完成工作
		observable = new Observable(this);
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
