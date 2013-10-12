package command.remote;

public class Hottub {
	private boolean on;
	private int temperature;

	public Hottub() {
	}

	public void on() {
		on = true;
	}

	public void off() {
		on = false;
	}
	
	/**
	 * 热水器进入保温状态
	 */
	public void circulate() {
		if (on) {
			System.out.println("Hottub is bubbling!");
		}
	}

	/**
	 * 热水器喷气模式打开
	 */
	public void jetsOn() {
		if (on) {
			System.out.println("Hottub jets are on");
		}
	}
	
	/**
	 * 热水器喷气模式关闭
	 */
	public void jetsOff() {
		if (on) {
			System.out.println("Hottub jets are off");
		}
	}

	/**
	 * 热水器被设置加热到指定温度
	 * @param temperature
	 */
	public void setTemperature(int temperature) {
		if (temperature > this.temperature) {
			System.out.println("Hottub is heating to a steaming " + temperature + " degrees");
		}
		else {
			System.out.println("Hottub is cooling to " + temperature + " degrees");
		}
		this.temperature = temperature;
	}
}

