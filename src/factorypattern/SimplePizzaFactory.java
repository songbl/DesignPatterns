package factorypattern;

/**
 *  只干一件事：帮它的客户创建披萨
 *  通常是静态方法（也叫做静态工厂，只需要一个工厂类的使用，在生产产品的方法加上static）
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null ;
        if (type.equals("cheese")){
            pizza = new CheesePizza();
        }else if (type.equals("clam")){
            pizza = new ClamPizza();
        }else  if (type.equals("vegetable")){
            pizza = new VegetablePizza();
        }
        return pizza;
    }

    //静态工厂
    public static Pizza staticCreatePizza(String type){
        Pizza pizza = null ;
        if (type.equals("cheese")){
            pizza = new CheesePizza();
        }else if (type.equals("clam")){
            pizza = new ClamPizza();
        }else  if (type.equals("vegetable")){
            pizza = new VegetablePizza();
        }
        return pizza;
    }
}
