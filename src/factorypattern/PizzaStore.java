package factorypattern;

public class PizzaStore {
    SimplePizzaFactory factory ;
    public PizzaStore(SimplePizzaFactory factory){
     this.factory = factory ;
    }
    public Pizza orderPizza(String type){
        Pizza pizza ;
        //将 new 替换为工程对象创建，不在使用具体实例化
        pizza  = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
