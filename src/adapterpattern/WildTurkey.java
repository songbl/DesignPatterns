package adapterpattern;

public class WildTurkey  implements Turkey {
    @Override
    public void gobble() {
        System.out.println("咯咯的叫...");
    }

    @Override
    public void fly() {
        System.out.println("野火鸡能飞短距离");
    }
}
