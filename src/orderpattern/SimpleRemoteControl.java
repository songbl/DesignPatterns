package orderpattern;


/**
 *     调用者
 *
 *     持有一个命令对象，
 *
 *     发出请求（封装成对象）
 */
public class SimpleRemoteControl {

    Command simpeCommand;//有一个插槽持有命令，这个命令控制一个装置

    public SimpleRemoteControl(){}

    public void setSimpeCommand(Command simpeCommand) {
        this.simpeCommand = simpeCommand;//设置插槽控制命令，
    }

    public void buttonPressed(){//调用者通过调用命令对象的excute()发出请求

        simpeCommand.execute();//当按下按钮是，这个方法会被调用（某个时刻调用对象的方法，将请求付诸实践）
    }
}
