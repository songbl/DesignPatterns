package strategypattern;

/**
 *  策略模式定义了    算法族    ,分别封装起来,让他们之间可以     相互替换
 *  此模式让算法的变化独立于使用算法的客户。
 */
public class Main  {
    public static void main(String[] args)
    {
            Duck mallardDuck = new MallardDuck();
            mallardDuck.display();
            mallardDuck.performFly();//多了一层委托
            System.out.println("===================================");
            //测试二，动态设置飞行
             Duck  duckModel = new ModelDuck();
             duckModel.performFly();
             duckModel.setFlyBehavior(new FlyRocketPower());//可以动态的替换
             duckModel.performFly();
    }



}
