package compound.combining.ducks;

public class DuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}
	
	public void simulate(){
		// 实例化各类鸭子对象
		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		// 测试各个鸭子对象
		System.out.println("\nDuck Simulator");
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);//用GooseAdapter将Goose封装，然后模拟器就像对待其他duck接口一样对待Goose。
 	}
	
	private void simulate(Quackable duck){
		duck.quack();
	}

}
