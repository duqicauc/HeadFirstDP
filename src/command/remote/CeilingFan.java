package command.remote;

import com.sun.org.apache.regexp.internal.recompile;

public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	private String location;
	private int speed;
	
	/**
	 * 风扇默认为不转状态哦
	 * */
	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}
	
	public void high(){
		speed = HIGH;
		// code to set fan to high
		System.out.println("Now the " + location + "'s Fan is high speed");
	}
	
	public void medium(){
		speed = MEDIUM;
		// code to set fan to medium
		System.out.println("Now the " + location + "'s Fan is medium speed");
	}
	
	public void low() {
		speed = LOW;
		// code to set fan to low
		System.out.println("Now the " + location + "'s Fan is low speed");
	}
	
	public void off(){
		speed = OFF;
		// code to turn fan off
		System.out.println("Now the " + location + "'s Fan is off speed");
	}
	
	/**
	 * 获取当前的风扇速度
	 * @return speed
	 */
	public int getSpeed(){
		return speed;
	}
}
