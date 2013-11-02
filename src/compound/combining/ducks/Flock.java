package compound.combining.ducks;

import java.util.*;

public class Flock implements Quackable {
	private ArrayList quackers = new ArrayList();
	
	public void add(Quackable quacker){
		quackers.add(quacker);
	}
	
	@Override
	/**
	 * 针对一群鸭子发出的quack调用，应该利用迭代器迭代这群鸭子的每一个
	 * */
	public void quack() {
		Iterator iterator = quackers.iterator();// Iterator Pattern
		while (iterator.hasNext()) {
			Quackable quacker = (Quackable) iterator.next();
			quacker.quack();
		}
	}

	@Override
	/**
	 * 如果监听某个composite节点，那么就要在注册的时把它的所有子节点也注册了
	 * */
	public void registerObserver(Observer observer) {
		Iterator iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}

	@Override
	/**
	 * composite不用通知，因为它自己本身不quack
	 * */
	public void notifyObservers() {}

}
