package orderpattern;


/**
 *  命令模式的客户
 */
public class SimpleRemoteControl {

    Command simpeCommand;//有一个插槽持有命令，这个命令控制一个装置
    public SimpleRemoteControl(){}

    public void setSimpeCommand(Command simpeCommand) {
        this.simpeCommand = simpeCommand;//设置插槽控制命令，
    }
    public void buttonPressed(){
        simpeCommand.execute();//当按下按钮是，这个方法会被调用，
    }
}
