package singleton;

public class MinisterDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 定义五个大臣
		int ministerNum = 5;
		for (int i = 0; i < ministerNum; i++) {
			Emperor emperor = Emperor.getInstance();
			System.out.print("第" + (i+1) +"个大臣参拜的是： ");
			emperor.say();
		}

	}

}
