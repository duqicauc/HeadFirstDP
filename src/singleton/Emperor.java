package singleton;

import java.util.Random;
import java.util.Vector;

/* 单例模式的扩展：如果要求一个类只能产生两三个对象呢？ */
public class Emperor {
	private static int maxNumOfEmperor = 2; //最多能产生2个实例
	// 每个皇帝都有名字，使用Vector来存放，不用ArrayList是因为Vector线程安全
	private static Vector<String> nameVector = new Vector<String>(); 
	// 定义一个Vector实例，存放所有的实例
	private static Vector<Emperor> emperorVector = new Vector<Emperor>();
	// 当前皇帝的序列号
	private static int countNumOfEmperor = 0;
	
	/* 产生所有的对象 */
	static{
		for (int i = 0; i < maxNumOfEmperor; i++) {
			emperorVector.add(new Emperor("皇" + (i+1) + "帝"));
		}
	}
	
	/* 私有的构造函数 */
	private Emperor(){
		
	}
	
	private Emperor(String name){
		nameVector.add(name);
	}
	
	/* 随机获得一个皇帝对象 */
	public static Emperor getInstance(){
		Random random = new Random();
		//随机拉出一个皇帝，只要是个精神领袖就成
		countNumOfEmperor = random.nextInt(maxNumOfEmperor);
		return emperorVector.get(countNumOfEmperor);
	}
	
	/* 皇帝发话了 */
	public static void say(){
		System.out.println(nameVector.get(countNumOfEmperor));
	}
}
