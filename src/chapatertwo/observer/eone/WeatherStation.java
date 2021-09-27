package chapatertwo.observer.eone;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();


        CurrentConditionsDisplay    currentConditionsDisplay = new CurrentConditionsDisplay(data);
        //StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        //ForecastDisplay forecastDisplay = new ForecastDisplay();
        data.setMeasurements(80,65,30.4f);
        data.setMeasurements(81,64,32.4f);
        data.setMeasurements(82,63,33.4f);
        data.setMeasurements(83,62,34.4f);


    }
}
