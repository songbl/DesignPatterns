package orderpattern;

/**
 *  命令模式：将“请求”封装成对象，以便使用不同的请求、队列或者日志
 *  来参数化其它对象，命令模式也支持可撤销操作。
 */

//客户负责创建ConcreteCommand，并设置接收者
public class RremoteControlTest {
    public static void main(String args[]){
        //调用者。传入命令对象（setCommand），用来发出请求
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        //请求的接收者（知道如何进行必要的工作，实现这个请求）
        Light light = new Light() ;
        //创建命令，然后将接收者传给它（命令对象将动作和接收者包装在对象中，只暴露execute方法）
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        //把命令传给调用者（在某时刻调用命令的execute，践行请求）
        remoteControl.setSimpeCommand(lightOnCommand);
        //按钮，发出请求。调用者    发出请求
        remoteControl.buttonPressed();
    }
}
