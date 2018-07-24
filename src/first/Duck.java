package first;

public abstract class Duck {

    FlyBehavior flyBehavior ;//多态

    public Duck(){}

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }
}

