package first;

public class Main  {


    public static void main(String[] args)
    {
            Duck mallardDuck = new MallardDuck();
            mallardDuck.display();
            mallardDuck.performFly();

            //测试二，动态设置飞行
             Duck  duckModel = new ModelDuck();
             duckModel.performFly();
             duckModel.setFlyBehavior(new FlyRocketPower());
             duckModel.performFly();









    }



}
