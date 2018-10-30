package decorationpattern;

/**
 *    抽象装饰者类
 *
 *    利用继续达到类型匹配，         ================装饰者和被装饰者（基础组件）拥有相同超类。
 */
public abstract  class CondimentDecorator extends Beverage {//让CondimentDecorator可以取代Beverage，所以扩展自Beverage，

    public abstract String getDescription();//所有的调料装饰者都必须重新实现

}
