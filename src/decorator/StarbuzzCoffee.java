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
		
		Beverage beverage4 = new DarkRoast();
		beverage4.setSize(Beverage.VENTI);
		beverage4 = new Whip(beverage4);
		beverage4.setSize(Beverage.VENTI);
		System.out.println(beverage4.getDescription() + ":"
				+ df.format(beverage4.cost()));
		
		Beverage beverage5 = new Espresso();
		beverage5 = new Milk(beverage5);
		beverage5.setSize(Beverage.TALL);
		beverage5 = new Mocha(beverage5);
		beverage5.setSize(Beverage.VENTI);
		System.out.println(beverage5.getDescription() + ":"
				+ df.format(beverage5.cost()));
	}

}
