import displays.CurrentConditionsDisplay;
import displays.HeatIndexDisplay;
import displays.WeatherData;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(10, 20, 30);
        System.out.println("--------");
        weatherData.removeObserver(heatIndexDisplay);
        weatherData.setMeasurements(1, 2, 3);
    }
}
