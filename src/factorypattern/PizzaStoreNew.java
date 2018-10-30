package factorypattern;

/**
 *  将创建披萨的移动到店里，具体的创建过程由不同的店自己去实现
 *
 *  抽象创建者类,它定义一个抽象工厂方法，让它的子类实现（继承也是）
 *  此方法制造产品。创建者通常会包含依赖于抽象产品的代码，
 *  而这些抽象产品由子类制造，创建者不需要真的知道创造哪个具体产品
 */
public abstract class PizzaStoreNew {//生产Pizza的店铺啊。。顶级（客户。。）
    public  Pizza orderPizza(String type){
        Pizza pizza ;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return  pizza;
    }

    /**
     *   /工厂方法可能需要参数（用于指定所需产品）
     *  abstract Product  factoryMethod(String type)
     *  工厂方法时抽象的，工厂方法必须返回一个产品，工厂方法将客户（披萨店。也就是超类代码
     *  ，如orderPizza）和实际创建的产品的代码分割开。
     */
    //实例化披萨的责任被移到一个“方法”中，此方法就如同一个“工厂”
    abstract Pizza
    createPizza(String type);

}
