package decorationpattern;

/**
 *  具体组件
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "星巴滋咖啡";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
