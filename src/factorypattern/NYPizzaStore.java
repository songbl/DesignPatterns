package factorypattern;

/**
 * 很像简单工厂。简单工厂把所有的事情都在子类做做完，工厂方法确实创建一个框架，让子类决定如何实现。
 *
 */


public class NYPizzaStore extends PizzaStoreNew {
    Pizza pizza ;

    /**
     *  具体生产某个产品，延迟到了具体的子类中
     */
    @Override
    Pizza createPizza(String type) {
       if (type.equals("cheese")){
           pizza = new NYStyleCheesePizza();
       }else  if (type.equals("vegetable")){
           pizza = new NYStyleVegetablePizza();
       }
       return  pizza;
    }


}
