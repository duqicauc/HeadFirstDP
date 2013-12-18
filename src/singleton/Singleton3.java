package singleton;

/* 加同步锁前后两次判断实例是否已经存在，优化Singleton2。
 * 原因：只有当instance为null时即没有创建实例时，需要
 * 加锁操作；当instance已经创建出来以后则无需加锁*/
public class Singleton3 {
	private static Singleton3 instance = null;
	
	private Singleton3(){
		
	}
	
	private static Singleton3 getInstance(){
		if (instance == null) {
			synchronized (Singleton3.class) {
				if (instance == null) {
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}
}
