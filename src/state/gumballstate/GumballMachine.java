package state.gumballstate;


public class GumballMachine {
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	private State winState;
	
	private String location;	// 表示糖果机的位置
	private State state = soldOutState; // 负责跟踪状态机的变化
	private int count = 0; // 记录糖果机器中的糖果数量
	
	public GumballMachine(String location,int numberGumballs) {
		this.soldOutState = new SoldOutState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.soldState = new SoldState(this);
		this.winState = new WinnerState(this);
		this.location = location;
		this.count = numberGumballs;
		if (count > 0) {
			state = noQuarterState; //糖果机的初始状态，没有获取25分，
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
		if ((state == soldState) || (state == winState)) {
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
		result.append("\nLocation: "+location);
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\nMachine is " + state + "\n");
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

	/**
	 * @return the winState
	 */
	public State getWinState() {
		return winState;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	
	
	
}
