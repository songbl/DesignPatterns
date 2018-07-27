package decorationpattern;

/**
 *    装饰者类
 */
public abstract  class CondimentDecorator extends Beverage {//让CondimentDecorator可以取代Beverage，所以扩展自Beverage，

    public abstract String getDescription();//所有的调料装饰者都必须重新实现
}
