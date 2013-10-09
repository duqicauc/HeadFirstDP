package singleton;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	private static ChocolateBoiler uniqueChocolateBoiler;			//记录该类的唯一实例的引用
	
	// 将构造函数定义为private
	private ChocolateBoiler(){
		empty = true;
		boiled = false;
	}
	
	// 定义一个公开的类接口（static），检查该类是否已经实例化并返回该引用值
	// 如果创建实例的代码开销不严重，那就直接用这个关键字即可，但是如果创建实例的代码位于经常执行的代码片段，则要注意它可能会影响到你的程序效率哦
	public static synchronized ChocolateBoiler getInstance(){
		if (uniqueChocolateBoiler == null) {
			uniqueChocolateBoiler = new ChocolateBoiler();
		}
		return uniqueChocolateBoiler;
	}
	
	public void fill(){
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
		}
	}
	
	public void drain(){
		if (!isEmpty()&&isBoiled()) {
			//drain the boiled milk and chocolate
			empty = true;
		}
	}
	
	public void boil(){
		if (!isEmpty()&&!isBoiled()) {
			//bring the contents to a boil
			boiled = true;
		}
	}
	
	public boolean isEmpty(){
		return empty;
	}
	
	public boolean isBoiled(){
		return boiled;
	}
}
