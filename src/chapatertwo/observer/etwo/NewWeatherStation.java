package chapatertwo.observer.etwo;

public class NewWeatherStation {
    public static void main(String[] args) {
        NewWeatherData data = new NewWeatherData();



        NewCurrentConditionsDisplay currentConditionsDisplay = new NewCurrentConditionsDisplay(data);
        //StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        //ForecastDisplay forecastDisplay = new ForecastDisplay();
        data.setMeasurements(80,65,30.4f);
        data.setMeasurements(81,64,32.4f);
        data.setMeasurements(82,63,33.4f);
        data.setMeasurements(83,62,34.4f);


    }
}

