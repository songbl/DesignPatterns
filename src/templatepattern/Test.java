package templatepattern;

import orderpattern.Light;
import orderpattern.LightOnCommand;
import orderpattern.SimpleRemoteControl;

public class Test {

    public static void main(String[] args) {

        Tea myTea = new Tea();
        myTea.prepareRecipe();
        //高层组件决定何时调用低层组件
        //myTea.brew();//该方法依赖倒置了，违反好莱坞原则。低层组件依赖高层组件

    }
}
