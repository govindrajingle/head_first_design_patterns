package code.in;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(80, 60, 30.4f);
        weatherData.setMeasurements(90, 50, 33.4f);
        weatherData.setMeasurements(70, 70, 90.4f);

    }
}
