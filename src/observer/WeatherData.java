package observer;

import java.util.*;

public class WeatherData implements Subject {
	private List<Observer> observersList;	
	private float temperature;				
	private float humidity;					
	private float pressure;					

	public WeatherData() {
		observersList = new ArrayList<Observer>();
	}

	/**
	 * @return the temperature
	 */
	public float getTemperature() {
		return temperature;
	}



	/**
	 * @param temperature the temperature to set
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
	 * @param humidity the humidity to set
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
	 * @param pressure the pressure to set
	 */
	public void setPressure(float pressure) {
		this.pressure = pressure;
		measurementsChanged();
	}



	/**
	 * 当天气数据改变时，通知观察者更新他们的显示内容太
	 * */
	public void measurementsChanged() {
		notifyObserver();
	}



	@Override
	public void registObserver(Observer o) {
		observersList.add(o);
	}



	@Override
	public void removeObserver(Observer o) {
		int i = observersList.indexOf(o);
		if (i >= 0) {
			observersList.remove(i);
		}
		
	}



	@Override
	public void notifyObserver() {
		int listSize = observersList.size();
		for (int i = 0; i < listSize; i++) {
			Observer observer = observersList.get(i);
			observer.update(temperature, humidity, pressure);//ֱ�ӽ���״̬���ݸ�۲��ߣ�����ʲô�÷���ô��
		}
	}
	
	public void setMeasurements(float temerature,float humidity,float pressure){
		this.temperature = temerature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
