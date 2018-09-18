package adapterpattern;

/**
 *  1.客户认为他正在 和鸭子沟通
 *  2.目标是鸭子类，
 *  3.适配器实现了鸭子的接口，它收到方法的调用时，全部委托给了火鸡（调用quack（）方法，委托执行火鸡的咯咯叫...）
 *  4.由于适配器，火鸡（被适配者）会街道客户作用于鸭子接口上的调用
 */

public class DuckTest {
    public static void main(String args[]){
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();//火鸡
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("这个火鸡说.....");
        turkey.gobble();
        turkey.fly();

        System.out.println("鸭子说....");
        testDuck(duck);

        System.out.println("适配器的火鸡说....");//虽然伪装过去，本质还是自己，咯咯叫,短飞行
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
