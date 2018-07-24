package first;

/**
 *  委托   不会飞的假鸭子，（飞行动作都是由委托类完成）
 */
public class FlyNoWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("假的，我不会飞....");
    }
}
