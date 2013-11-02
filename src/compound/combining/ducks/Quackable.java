package compound.combining.ducks;

/**
 * 发生接口，任何鸭子要叫，都要实现该接口
 * 然后由各自实现不同的具体quack方法
 * */
public interface Quackable extends QuackObservable{
	public void quack();
}
