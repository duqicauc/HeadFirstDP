package observer;

public class CurrentConditionDisplay implements Observer,DisplayElement {
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	public CurrentConditionDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
		
	}

	@Override
	public void display() {
		System.out.println("Current Conditions:" + temperature + 
				" F degrees and " + humidity + " % humidity.");
		
	}

}
