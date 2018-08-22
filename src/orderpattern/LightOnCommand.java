package orderpattern;

public class LightOnCommand implements Command {
    Light light ;
    @Override
    public void execute() {
        light.on();
    }

    //传入某个等，例如客厅点灯，记录变量，一旦调用execute();
    //这个点灯对象就变成了接受者，负责接受请求
    public LightOnCommand(Light light){
        this.light = light ;
    }
}
