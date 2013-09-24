package observable;

import java.util.Observable;

public class WeatherData extends Observable {//Observable是一个类，不是接口
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {

	}

	/**
	 * 每次WeatherData的状态改变时，都要调用这两句话，而又有分别的set和整体的set函数，
	 * 所以将之 抽取为一个工具函数，减少重复代码
	 * */
	private void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity,
			float presssure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = presssure;
		measurementsChanged();
	}

	/**
	 * @return the temperature
	 */
	public float getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature
	 *            the temperature to set
	 */
	public void setTemperature(float temperature) {
		this.temperature = temperature;
		measurementsChanged();
	}

	/**
	 * @return the humidity
	 */
	public float getHumidity() {
		return humidity;
	}

	/**
	 * @param humidity
	 *            the humidity to set
	 */
	public void setHumidity(float humidity) {
		this.humidity = humidity;
		measurementsChanged();
	}

	/**
	 * @return the pressure
	 */
	public float getPressure() {
		return pressure;
	}

	/**
	 * @param pressure
	 *            the pressure to set
	 */
	public void setPressure(float pressure) {
		this.pressure = pressure;
		measurementsChanged();
	}

}
