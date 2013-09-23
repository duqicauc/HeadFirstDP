package observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.2f;
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registObserver(this);
	}

	@Override
	/**
	 * 通过比较前后两次的气压差简单预测天气
	 * */
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}

	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;
		display();

	}

}
