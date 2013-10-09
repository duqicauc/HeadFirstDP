package singleton;


public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	private volatile static ChocolateBoiler uniqueChocolateBoiler;			//记录该类的唯一实例的引用
	
	// 将构造函数定义为private
	private ChocolateBoiler(){
		empty = true;
		boiled = false;
	}
	
	// 定义一个公开的类接口（static），返回该引用值
	public static ChocolateBoiler getInstance(){
		if (uniqueChocolateBoiler == null) {
			synchronized (ChocolateBoiler.class) {
				if (uniqueChocolateBoiler == null) {
					uniqueChocolateBoiler = new ChocolateBoiler();
				}
			}
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
