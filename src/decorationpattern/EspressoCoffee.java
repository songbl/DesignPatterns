package decorationpattern;

public class EspressoCoffee extends Beverage {

    public EspressoCoffee(){
        description = "浓缩咖啡...";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
