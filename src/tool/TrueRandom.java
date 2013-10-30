package tool;

import java.util.Random;

public class TrueRandom {
	public static int randomNToM(int n, int m) {
		int randomNumber;
		int lowerbound = 0;
		int upperbound = 9;
		int lastindex = upperbound - lowerbound + 1;
		int rndavailable[] = new int[lastindex];
		Random random = new Random();
		for (int i = lowerbound; i <= upperbound; i++)
			rndavailable[i - lowerbound] = i;
//		for (int i = 1; i <= 10; i++) {
//			int rndindex = random1.nextInt(lastindex);
//			System.out.println("第" + i + "个随机数:" + rndavailable[rndindex]);
//			rndavailable[rndindex] = rndavailable[lastindex - 1];
//			lastindex--;
//		}
		int rndindex = random.nextInt(lastindex);
		return rndavailable[rndindex];
	}
	
	public static void main(String[] args) {
		System.out.println(TrueRandom.randomNToM(0, 9));
	}
}
