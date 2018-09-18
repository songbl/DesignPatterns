package adapterpattern;

/**
 * 缺少鸭子对象，用一些火鸡来冒充
 */

//首先，需要实现想转换成的类型接口，客户所期望的接口
public class TurkeyAdapter implements Duck {
    Turkey turkey ;

    //接着，需要取得适配的对象引用。这里通过构造方法取得
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey ;
    }
    @Override
    //实现接口中所有方法；
    public void quack() {
        turkey.gobble();
    }

    @Override
    //飞行的太短，多飞几次吧
    public void fly() {
        for (int i=0;i<5;i++){
            turkey.fly();
        }
    }
}
