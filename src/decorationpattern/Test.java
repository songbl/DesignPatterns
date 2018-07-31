package decorationpattern;

public class Test
{
    public static void main (String args[]){
//        Beverage beverage = new Espresso();
//        logIn(beverage.getDescription()+"￥"+beverage.cost());


        Beverage beverage3= new HouseBlend();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Sugar(beverage3);
        logIn(beverage3.getDescription()+" 咖啡消费="+beverage3.cost());
    }

    public static void logIn(String s){
        System.out.println(s);
    }
}
