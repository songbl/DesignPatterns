package decorationpattern;

/**
 *  抽象组件
 */
public abstract class Beverage {
    String description = "Unknow CaffeineBeverage";

    public String getDescription() {
        System.out.println("调用顶级饮料类...");
        return description;
    }

    public abstract double cost();
}
