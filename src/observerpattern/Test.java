package observerpattern;

public class Test {
    public static void main(String[] args) {
        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();//被观察者（主题）
        ConditionsObserver currentConditionsDisplay = new ConditionsObserver(weatherDataSubject);//观察者
        OnlyTemperatureObserver onlyTemperatureObserver = new OnlyTemperatureObserver(weatherDataSubject);//另一个观察者
        weatherDataSubject.setDatas(38,25,29.2f);
    }

    }
