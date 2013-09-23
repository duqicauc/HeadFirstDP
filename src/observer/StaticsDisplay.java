package observer;

public class StaticsDisplay implements Observer, DisplayElement {
	private float temperatureSum = 0.0f;
	private float temperatureMin = 200;
	private float temperatureMax = 0.0f;
	private int numReading = 0;
	private Subject weatherData;

	public StaticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Avg/Min/Max:" + (temperatureSum / numReading) + "/"
				+ temperatureMin + "/" + temperatureMax);

	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		temperatureSum += temperature;
		numReading++;

		if (temperature < temperatureMin) {
			temperatureMin = temperature;
		}

		if (temperatureMax < temperature) {
			temperatureMax = temperature;
		}

		display();

	}

}
