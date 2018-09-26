package statuepattern;

public class NoQuarterStatue implements Statue {
    GumballMachine gumballMachine ;

    public NoQuarterStatue(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("接受了25美分，改变状态");
        gumballMachine.setStatue(GumballMachine.HAS_QUARTER);
    }

    @Override
    public void ejectQUarter() {
        System.out.println("没有钱，不能退钱啊");
    }

    @Override
    public void turnCrank() {
        System.out.println("没有钱，不能转动杠杆");
    }

    @Override
    public void dispense() {
        System.out.println("没有钱，不能发放糖果");
    }
}
