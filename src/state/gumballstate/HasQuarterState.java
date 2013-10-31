package state.gumballstate;

import java.util.Random;

import tool.TrueRandom;

public class HasQuarterState implements State{
	private GumballMachine gumballMachine;
	private Random winnerRandom = new Random(System.currentTimeMillis()); //随机数生成器
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		/* 状态转移：由HasQuarter到NoQuarter*/
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		/* 状态转移：由HasQuarter到WinState(10%)或者SoldState(90%)*/
		System.out.println("You turned...");
		int winner = winnerRandom.nextInt(10);
		//int winner = TrueRandom.randomNToM(0, 9);
		//int winner = 0;
		if ((winner == 0) && (gumballMachine.getCount()>1)) {
			gumballMachine.setState(gumballMachine.getWinState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}
	
	public String toString(){
		return "waiting for turn of crank";
	}

}
