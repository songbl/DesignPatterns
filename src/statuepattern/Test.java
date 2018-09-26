package statuepattern;

public class Test {
    public static void main(String args[]){
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);

        gumballMachine.insetQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.statue);

        gumballMachine.insetQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.statue);

        gumballMachine.insetQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insetQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        System.out.println(gumballMachine.statue);

        gumballMachine.insetQuarter();
        gumballMachine.insetQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insetQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insetQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.statue);

    }
}
