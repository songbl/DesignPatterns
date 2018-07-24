package first;

/**
 *  代理不会飞行的鸭子吗，（飞行动作都是由代理类完成）
 */
public class FlyNoWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("假的，谁知道怎么飞起来的....");
    }
}
