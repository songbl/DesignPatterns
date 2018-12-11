package factorypattern;

public class Test {
    public static void main (String args[]){
//        Pizza pizza = new SimplePizzaFactory().createPizza("vegetable");
//        pizza.cut();

        //简单工厂
//        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
//        pizzaStore.orderPizza("vegetable");
        //简单工厂
//        Pizza pizza = SimplePizzaFactory.staticCreatePizza("cheese");
//        pizza.cut();


        //工厂方法
//        Pizza pizza1 = new NYPizzaStoreFactory().createPizza("cheese");
//        new NYPizzaStoreFactory().orderPizza("vegetable");

        Pizza pazz2 = new NYPizzaStoreFactory().orderPizza("vegetable");
        pazz2.cut();


//        PizzaStoreNew nytore = new NYPizzaStoreFactory();
//
//        Pizza pizza = nytore.orderPizza("cheese");
//        System.out.println("小龙订购一个"+pizza.getName());




    }
}

