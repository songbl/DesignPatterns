package factorypattern;

public class Test {
    public static void main (String args[]){
//        Pizza pizza = new SimplePizzaFactory().createPizza("vegetable");
//        pizza.cut();

        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("vegetable");

        Pizza pizza = SimplePizzaFactory.staticCreatePizza("cheese");
        pizza.cut();
    }
}

