package first;

/**
 *  委托   不用翅膀的鸭子，（飞行动作都是由委托类完成）
 */
public class FlyNoWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("假的，谁知道怎么飞起来的....");
    }
}
