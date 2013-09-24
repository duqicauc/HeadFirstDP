package decorator;

import java.text.DecimalFormat;

public class StarbuzzCoffee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + ":" + espresso.cost());

		Beverage houseBlendWithMilk = new HouseBlend();
		houseBlendWithMilk = new Milk(houseBlendWithMilk);
		houseBlendWithMilk = new Mocha(houseBlendWithMilk);
		houseBlendWithMilk = new Milk(houseBlendWithMilk);
		DecimalFormat df = new DecimalFormat(".##");
		System.out.println(houseBlendWithMilk.getDescription() + ":"
				+ df.format(houseBlendWithMilk.cost()));

		/* 测试按照大小计算价格 */

		Beverage beverage3 = new Decaf();
		beverage3 = new Soy(beverage3);
		beverage3.setSize(Beverage.TALL);
		System.out.println(beverage3.getDescription() + ":"
				+ df.format(beverage3.cost()));

	}

}
