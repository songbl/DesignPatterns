package factorypattern;

import java.util.regex.Pattern;

public class Test {
    public static void main (String args[]){
//        Pizza pizza = new SimplePizzaFactory().createPizza("vegetable");
//        pizza.cut();

        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("vegetable");
//
//        Pizza pizza = SimplePizzaFactory.staticCreatePizza("cheese");
//        pizza.cut();


//        Pizza pizza1 = new NYPizzaStore().createPizza("cheese");
//        new NYPizzaStore().orderPizza("vegetable");

//        PizzaStoreNew nytore = new NYPizzaStore();
//
//        Pizza pizza = nytore.orderPizza("cheese");
//        System.out.println("小龙订购一个"+pizza.getName());


//        String url = "http:/klsfnklnklwnl.csfwfwn.cn?1231=sjkfjkf&sfwfw=";
//        String regex = "^([hH][tT]{2}[pP]:/*|[hH][tT]{2}[pP][sS]:/*|[fF][tT][pP]:/*)(([A-Za-z0-9-~]+).)+([A-Za-z0-9-~\\/])+(\\?{0,1}(([A-Za-z0-9-~]+\\={0,1})([A-Za-z0-9-~]*)\\&{0,1})*)$";
//        Pattern pattern = Pattern.compile(regex);
//        if (pattern.matcher(url).matches()) {
//            System.out.println("是正确的网址");
//        } else {
//            System.out.println("非法网址");
//        }


    }
}

