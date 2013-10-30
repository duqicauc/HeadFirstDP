package state.gumballstate;


public class GumballMachine {
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	
	private State state = soldOutState; // 负责跟踪状态机的变化
	private int count = 0; // 记录糖果机器中的糖果数量
	
	public GumballMachine(int numberGumballs) {
		this.soldOutState = new SoldOutState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.soldState = new SoldState(this);
		this.count = numberGumballs;
		if (count > 0) {
			state = noQuarterState;
		}
	}
	
	/**
	 * 投入25fen
	 * */
	public void insertQuarter(){
		state.insertQuarter();
	}
	
	/**
	 * 退回25分
	 * */
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	
	/**
	 * 转动曲柄
	 * */
	public void turnCrank(){
		// 依照当前状态执行相应的turnCrank动作
		state.turnCrank();
		// turnCrank执行后状态若为soldState，即状态转换正常则执行dispense
		if (state == soldState) {
			state.dispense();
		}
	}
	
	/**
	 * 取出糖果
	 * */
	public void dispense(){
		state.dispense();
	}
	
	/**
	 * 重新装填糖果
	 * */
	public void refill(int numGumBalls) {
		this.count = numGumBalls;
		state = noQuarterState;
	}
	
	/**
	 * 释放出糖果
	 * */
	public void releaseBall(){
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
	
	/**
	 * 把对象转换成String类型
	 * */
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004\n");
		result.append("Inventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\nMachine is ");
		if (state == soldOutState) {
			result.append("sold out");
		} else if (state == noQuarterState) {
			result.append("waiting for quarter");
		} else if (state == hasQuarterState) {
			result.append("waiting for turn of crank");
		} else if (state == soldState) {
			result.append("delivering a gumball");
		}
		result.append("\n");
		return result.toString();
	}
	
	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}

	/**
	 * @return the soldOutState
	 */
	public State getSoldOutState() {
		return soldOutState;
	}

	/**
	 * @return the noQuarterState
	 */
	public State getNoQuarterState() {
		return noQuarterState;
	}

	/**
	 * @return the hasQuarterState
	 */
	public State getHasQuarterState() {
		return hasQuarterState;
	}

	/**
	 * @return the soldState
	 */
	public State getSoldState() {
		return soldState;
	}

	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	
	
}
