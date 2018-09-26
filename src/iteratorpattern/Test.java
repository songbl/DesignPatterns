package iteratorpattern;

public class Test {
    public static void main(String args[]){
        DineMenu dineMenu = new DineMenu();
        Waitress waitress = new Waitress(dineMenu);
        waitress.printMenu();
    }
}
