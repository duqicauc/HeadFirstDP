package compound.combining.ducks;

/**
 * Duck Decorator
 * 添加功能：计算鸭子的叫的次数
 * */
public class QuackCounter implements Quackable {
	private Quackable duck;
	private static int numberOfQuacks = 0;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}

	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;//装饰器就是在它装饰的对象执行相同动作之前或者之后做额外的工作
	}
	
	public static  int getNumberOfQuack(){
		return numberOfQuacks;
	}

	@Override
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		duck.notifyObservers();
	}
	
	/* 在Decorator类中，toString可以不重写，应该是父类有个默认的实现 ,
	 * 最后总会调用到被它装饰的那个duck.toString()*/
//	public String toString(){
//		return duck.toString();
//	}

}
