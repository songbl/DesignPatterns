package iteratorpattern;

public class MenuItem {

    String name;
    String des;

    public MenuItem (String name,String des){
        this.name = name;
        this.des = des;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
