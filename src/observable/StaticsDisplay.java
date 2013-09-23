package observable;

import java.util.Observable;
import java.util.Observer;

import observer.DisplayElement;


public class StaticsDisplay implements Observer, DisplayElement {
	private float temperatureMin = 200;
	private float temperatureMax;
	private float temperatureSum;
	private int numReadings;
	private Observable observable;

	public StaticsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min:" + (temperatureSum / numReadings)
				+ "/" + temperatureMax + "/" + temperatureMin + ".");
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			float temp = weatherData.getTemperature();
			temperatureSum += temp;
			numReadings++;

			if (temp < temperatureMin) {
				temperatureMin = temp;
			}

			if (temperatureMax < temp) {
				temperatureMax = temp;
			}

			display();
		}

	}

}
