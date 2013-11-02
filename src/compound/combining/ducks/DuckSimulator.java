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
		
		/* 实例化一个Flock对象，然后将鸭子对象填充进去 */
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		
		Flock flockOfMallards = new Flock();
		Quackable mallardOne =  duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("\nDuck Simulator: With Observer");
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		simulate(flockOfDucks);
		
//		System.out.println("\nDuck Simulator: Mallard Flock Simulator");
//		simulate(flockOfMallards);
		
//		// 测试各个鸭子对象
//		System.out.println("\nDuck Simulator: With Abstract Factory");
//		simulate(mallardDuck);
//		simulate(redheadDuck);
//		simulate(duckCall);
//		simulate(rubberDuck);
//		simulate(gooseDuck);//用GooseAdapter将Goose封装，然后模拟器就像对待其他duck接口一样对待Goose。
		
		System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuack() + " times");
 	}
	
	private void simulate(Quackable duck){
		duck.quack();
	}

}
