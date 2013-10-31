package state.gumballstate;

public class WinnerState implements State{
	private transient GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you two gumballs");
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
		/* 状态转移： 由WinnerState到SoldOutState或者NoQuarterState*/
		System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("Oops, Out of gumball");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
	
	public String toString(){
		return "dispensing two gumballs";
	}

}
