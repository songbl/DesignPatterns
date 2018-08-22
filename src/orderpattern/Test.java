package orderpattern;

public class Test {

    public static void main(String[] args) {

        //创建一个点灯对象，此对象是请求的接收者(接收者知道如何工作)
        Light light = new Light();
        //创建一个命令，然后将接收者传递给他(构造成请求)
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        //遥控器调用者，传入命令对象，用来发出请求
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setSimpeCommand(lightOnCommand);

        //启动
        simpleRemoteControl.buttonPressed();
    }
}
