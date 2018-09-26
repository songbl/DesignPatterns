package decorationpattern;

/**
 * 类应该对扩展开放，对修改关闭（目标是允许类容易扩展，在不修改现有代码得情况下，可以搭配新的行为）
 * ===在最有可能改变得覅放，应用开放-关闭原则
 *
 *
 *^^^^^^^抽象组件^^^^^^^
 */
public abstract class Beverage {
    String description = "Unknow CaffeineBeverage";

    public String getDescription() {
        System.out.println("调用顶级饮料类...");
        return description;
    }

    public abstract double cost();
}
