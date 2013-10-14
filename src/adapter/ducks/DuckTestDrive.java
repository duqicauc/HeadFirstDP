package adapter.ducks;

public class DuckTestDrive {
	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		
		System.out.println("The turkey says...");
		Turkey wildTurkey = new WildTurkey();
		wildTurkey.gobble();
		wildTurkey.fly();
		
		System.out.println("\nThe MallardDuck says...");
		testDuck(mallardDuck);
		
		System.out.println("\nThe TurkeyAdapter says... ");
		Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
		//给testDuck的感觉是Duck接口，但实际上TurkeyAdapter内部是跟Turkey接口在对话
		testDuck(turkeyAdapter);
		
	}

}
