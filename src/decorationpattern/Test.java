package decorationpattern;

import java.io.*;

/**
 * ==装饰者可以在所委托被装饰者的行为之前或之后，加上自己的行为，以达到目的
 *==装饰者模式：动态地将责任附加到对象上，若要扩展功能，装饰者提供比继承更有弹性的替代方案
 *
 */

public class Test
{
    public static void main (String args[]){
        testInput();

        Beverage beverage = new EspressoCoffee();
        logIn(beverage.getDescription()+"￥"+beverage.cost());  //组件单独使用


        Beverage beverage3= new HouseBlendCoffee();//具体组件
        beverage3 = new Mocha(beverage3);//具体装饰者
        beverage3 = new Sugar(beverage3);//具体装饰者
//        beverage3 = new Mocha(beverage3);//具体装饰者   //保存被装饰者。调用被装饰者之前的行为，加上装饰者本身的行为;从最外层开始调用。
        logIn(beverage3.getDescription()+" 咖啡消费="+beverage3.cost());
    }

    public static void logIn(String s){
        System.out.println(s);
    }

    public static void testInput(){
        try {
            byte a [] = new byte[2];
            InputStream inputStream = new BufferedInputStream(new FileInputStream("D:\\aa.txt"));
            inputStream.read(a);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
