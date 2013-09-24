package observable;

import java.util.Observable;
import java.util.Observer;

import observer.DisplayElement;


public class CurrentConditionDisplay implements Observer, DisplayElement {
	private Observable observable;
	private float temperature;
	private float humidity;

	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	/**
	 * o代表Subject对象；
	 * arg代表notifyObserver函数传递进来的参数，本例WeatherData那边未传递，所以arg不处理
	 * */
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}

	}

	@Override
	public void display() {
		System.out.println("Current Conditions: " + temperature
				+ " F degrees and " + humidity + "% humidity.");

	}

}
