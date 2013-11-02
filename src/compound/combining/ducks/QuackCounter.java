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

}
