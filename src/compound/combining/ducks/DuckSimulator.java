package compound.combining.ducks;

public class DuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountintDuckFactory();
		AbstractGooseFactory gooseFactory = new GooseFactory();
		
		simulator.simulate(duckFactory,gooseFactory);
	}
	
	public void simulate(AbstractDuckFactory duckFactory,AbstractGooseFactory gooseFactory){
		// 实例化各类鸭子对象,然后用一个计数装饰类封装之
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		
		Quackable gooseDuck = gooseFactory.createGooseDuck();
		
		// 测试各个鸭子对象
		System.out.println("\nDuck Simulator: With Abstract Factory");
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);//用GooseAdapter将Goose封装，然后模拟器就像对待其他duck接口一样对待Goose。
		
		System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuack() + " times");
 	}
	
	private void simulate(Quackable duck){
		duck.quack();
	}

}
