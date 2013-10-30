package tool;

import java.util.Random;

public class TrueRandom {
	/**
	 * 生成[n,m]之间的随机数
	 * 注意，不是“伪随机数”
	 * */
	public static int randomNToM(int n, int m) {
		int lowerbound = 0;
		int upperbound = 9;
		int lastindex = upperbound - lowerbound + 1;
		int rndavailable[] = new int[lastindex];
		Random random = new Random();
		for (int i = lowerbound; i <= upperbound; i++)
			rndavailable[i - lowerbound] = i;
		int rndindex = random.nextInt(lastindex);
		return rndavailable[rndindex];
	}
	
	public static void main(String[] args) {
		System.out.println(TrueRandom.randomNToM(0, 9));
	}
}
