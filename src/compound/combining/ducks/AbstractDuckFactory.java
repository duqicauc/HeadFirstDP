package compound.combining.ducks;

/**
 * Abstract Factory
 * 子类会实现这个抽象类，然后创建不同门类
 * */
public abstract class AbstractDuckFactory {
	/* 每一个方法创建一种鸭子  */
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
