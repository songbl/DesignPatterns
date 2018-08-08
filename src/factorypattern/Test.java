package factorypattern;

public class Test {
    public static void main (String args[]){
//        Pizza pizza = new SimplePizzaFactory().createPizza("vegetable");
//        pizza.cut();

//        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
//        pizzaStore.orderPizza("vegetable");
//
//        Pizza pizza = SimplePizzaFactory.staticCreatePizza("cheese");
//        pizza.cut();


//        Pizza pizza1 = new NYPizzaStore().createPizza("cheese");
//        new NYPizzaStore().orderPizza("vegetable");

        PizzaStoreNew nytore = new NYPizzaStore();

        Pizza pizza = nytore.orderPizza("cheese");
        System.out.println("小龙订购一个"+pizza.getName());
    }
}

