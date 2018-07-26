package observerpattern;

public class OnlyTemperatureObserver implements Observer,DisplayElement {
   private float temperature ;
   Subject weatherDataSubject ;

   public OnlyTemperatureObserver(Subject subject){
       this.weatherDataSubject = subject ;
       weatherDataSubject.registerObserver(this);
   }
    @Override
    public void update(float temp, float hunidity, float pressure) {
        this.temperature = temp ;
        display();
    }

    @Override
    public void updateByPull(Subject subject) {

    }

    @Override
    public void display() {
        System.out.println("哎呀妈...温度改变了..."+temperature);
    }











}
