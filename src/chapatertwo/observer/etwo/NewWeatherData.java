package chapatertwo.observer.etwo;

import java.util.Observable;

public class NewWeatherData extends Observable {
        private float temperature;
        private float humidity;
        private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public NewWeatherData(){}

        public void measurementsChanged(){
            setChanged();
            notifyObservers();
        }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


}
