package first;

/**
 * 委托  会飞的鸭子，真实的鸭子（飞行动作都是由委托完成）
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("这是真的有翅膀的飞翔啊....");
    }
}