package orderpattern;

public class Test {

    /**
     * 发出请求的对象（调用者）和执行请求的对象（具体的实践执行）是解耦的
     * 通过命令对象进行沟通
     */
    public static void main(String[] args) {

        //创建一个点灯对象，此对象是请求的接收者(接收者知道如何工作)
        Light light = new Light();
        //创建一个命令，然后将接收者传递给他(构造成请求)
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        //遥控器调用者，传入命令对象，用来发出请求
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        //命令对象当做参数，运行时多态（通过命令对象来沟通呢）
        simpleRemoteControl.setSimpeCommand(lightOnCommand);

        //启动
        simpleRemoteControl.buttonPressed();
    }
}
