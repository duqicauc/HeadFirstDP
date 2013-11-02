package compound.combining.ducks;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 负责处理所有需要被监听的具体鸭子类中的通知/注册操作（通过组合进行委托）
 * 因为它要实现跟那些具体类一样的接口，所以它也得实现QuackObservable接口
 * */
public class Observable implements QuackObservable {
	private ArrayList observers =  new ArrayList();
	private QuackObservable duck;
	
	public Observable(QuackObservable duck){
		this.duck = duck;
	}
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		Iterator iterator = observers.iterator();
		//System.out.println(iterator.hasNext());
		while (iterator.hasNext()) {
			Observer observer = (Observer) iterator.next();
			observer.update(duck);
		}
	}

}
