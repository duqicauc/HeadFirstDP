package observer;

public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay  currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		

	}

}
