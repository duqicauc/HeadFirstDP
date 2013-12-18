package singleton;

/* 给getInstance加同步锁  or 给*/
public class Singleton2 {
	private static Singleton2 instance = null;
	
	private Singleton2(){
		
	}
	
//  （1）给getInstance方法加同步锁	
//	public static synchronized Singleton2 getInstance(){
//		if (instance == null) {
//			instance = new Singleton2();
//		}
//		return instance;
//	}
	
//  (2)使用同步代码块,将关键代码区域包含起来
	public static Singleton2 getInstance(){
		synchronized (Singleton2.class) {
			if (instance == null) {
				instance = new Singleton2();
			}
		}
		return instance;
	}
	
	
}
