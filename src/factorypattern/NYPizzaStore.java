package factorypattern;

public class NYPizzaStore extends PizzaStoreNew {
    Pizza pizza ;
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
