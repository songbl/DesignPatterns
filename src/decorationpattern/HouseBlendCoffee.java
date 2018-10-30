package decorationpattern;

/**
 *  具体组件
 */
public class HouseBlendCoffee extends Beverage {

    public HouseBlendCoffee(){
        description = "星巴滋咖啡";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
