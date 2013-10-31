package state.gumballstate;

/**
 * 状态：Gumball Sold
 * */
public class SoldState implements State{
	private GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turn the crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball");
	}

	@Override
	public void dispense() {
		/* 状态转移：由SoldState到NoQuarter或者SoldOutState */
		gumballMachine.releaseBall();
		// 如果机器中还有糖果，则设置状态为“NoQuarter”
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Oops, Out of gumball");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
	
	public String toString(){
		return "dispensing a gumball";
	}

}
