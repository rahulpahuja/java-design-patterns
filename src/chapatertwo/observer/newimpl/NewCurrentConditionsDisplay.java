package chapatertwo.observer.newimpl;

import chapatertwo.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class NewCurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public NewCurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver( this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: "+temperature+" F degrees and "+humidity+"% humidity");
    }


    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof NewWeatherData){
            NewWeatherData weatherData = (NewWeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
