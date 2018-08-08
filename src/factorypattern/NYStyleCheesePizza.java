package factorypattern;

public class NYStyleCheesePizza extends Pizza {


    public NYStyleCheesePizza(){
        name = "纽约类型奶酪披萨";
    }

    @Override
    public void cut() {
        System.out.println("纽约披萨真硬，大刀砍吧...");
    }


}
