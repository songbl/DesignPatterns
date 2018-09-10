package observerpattern;

/**
 *   观察者one
 *
 */
public class ConditionsObserver implements Observer,DisplayElement{

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject dataSubject;

    public ConditionsObserver(Subject dataSubject){
        this.dataSubject = dataSubject;
        dataSubject.registerObserver(this);//可以理解为，绑定
    }

    //todo me
    public ConditionsObserver(float temperature, float hunidity, float pressure){
        this.humidity = hunidity;
        this.temperature = temperature ;
        this.pressure = pressure ;
    }
    //todo me
    public ConditionsObserver(){

    }
    @Override
    public void update(float temperature, float hunidity, float pressure) {
        this.humidity = hunidity;
        this.temperature = temperature ;
        this.pressure = pressure ;
        display();
    }

    @Override
    public void updateByPull(Subject weatherSubject) {
        if (weatherSubject instanceof WeatherDataSubject){
            WeatherDataSubject weatherDataSubject = (WeatherDataSubject)weatherSubject ;
            System.out.println("仅仅显示温度/通过拉的方式获取温度："+weatherDataSubject.getTemperature());
        }

    }

    @Override
    public void display() {
        System.out.println("当前温度："+temperature+"当前湿度："+humidity+"当前压强："+pressure);
    }








}
