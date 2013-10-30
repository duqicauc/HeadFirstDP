package state.gumball;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class GumballMachine {
	private final static int SOLD_OUT = 0;   // Out of Gumball
	private final static int NO_QUARTER = 1;	// 等待投币25分
	private final static int HAS_QUARTER = 2;	// 拥有25分
	private final static int SOLD = 3;			// 卖出gumball
	
	private int state = SOLD_OUT; // 负责跟踪状态机的变化
	private int count = 0; // 记录糖果机器中的糖果数量
	
	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}
	
	/**
	 * 投入25fen
	 * */
	public void insertQuarter(){
		if (state == HAS_QUARTER) {
			System.out.println("You can't insert another quarter");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("You inserted a quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You can't insert a quarter, the machine is sold out");
		} else if (state == SOLD) {
			System.out.println("Please wait, we're already giving you a gumball");
		}
	}
	
	/**
	 * 退回25分
	 * */
	public void enjectQuarter(){
		if (state == HAS_QUARTER) {
			System.out.println("Quarter returned");
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			System.out.println("You haven't inserted a quarter");
		} else if (state == SOLD) {
			System.out.println("Sorry, you already turned the crank");
		} else if (state == SOLD_OUT) {
			System.out.println("You can't eject, you haven't inserted a quarter yet");
		}
	}
	
	/**
	 * 转动曲柄
	 * */
	public void turnCrank(){
		if (state == SOLD) {
			System.out.println("Turning twice doesn't get you another gumball");
		}else if (state == NO_QUARTER) {
			System.out.println("You turned but there's no quarter");
		}else if (state == SOLD_OUT) {
			System.out.println("You turned, but there are no gumballs");
		} else if (state == HAS_QUARTER) {
			System.out.println("You turned...");
			state = SOLD;
			dispense();
		}
	}
	
	/**
	 * 取出糖果
	 * */
	public void dispense(){
		if (state == SOLD) {
			System.out.println("A gumball comes rolling out the slot");
			count = count - 1;
			if (count == 0) {
				System.out.println("Oops, out of gumball");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else if (state == NO_QUARTER) {
			System.out.println("You need to pay first");
		} else if (state == SOLD_OUT) {
			System.out.println("No gumball dispensed");
		} else if (state == HAS_QUARTER) {
			System.out.println("No gumball dispensed");
		}
	}
}
