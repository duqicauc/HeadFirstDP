package singleton;

public class Singletion {
	private static Singletion uniqueSingletion;	//使用一个静态变量存放单例对象的引用值
	
	// 构造函数定义为private，只能从类的内部调用
	private Singletion(){
		
	}
	
	// 利用getInstance获取实例对象引用，如果已经存在，这不再调用Singletion()去实例化一个对象
	public static Singletion getInstance(){
		if (uniqueSingletion == null) {
			uniqueSingletion = new Singletion();
		}
		return uniqueSingletion;
	}
}
