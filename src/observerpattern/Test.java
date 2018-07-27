package observerpattern;

public class Test {
    public static void main(String[] args) {
        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();//先创建被观察者（主题），没有主题观察毛啊
        ConditionsObserver currentConditionsDisplay = new ConditionsObserver(weatherDataSubject);//观察者/初始化的时候就绑定在一起了（注册）
        OnlyTemperatureObserver onlyTemperatureObserver = new OnlyTemperatureObserver(weatherDataSubject);//另一个观察者
        weatherDataSubject.setDatas(38,25,29.2f);//被观察者更新数据了
    }

    }
