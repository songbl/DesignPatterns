package proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


/**
 *  1.先创建一个需要被代理的对象张三
 *  2.将zhangsan对象传递给stuHandler，
 *  3.在创建代理对象stuProxy时候，将stuHandler作为了参数
 *
 *
 *  ===优势在于，所有被代理执行的方法，都是通过在InvocationHandler中的invoke方法调用，所以再要在invoke中同一处理即可
 *
 */


public class ProxyTest {
    public static void main(String[] args) {
        //创建一个实例对象，这个对象是被代理的对象
        Person zhangsan = new Student("张三");
        //创建一个与代理相关的InvocationHan
        InvocationHandler stuHandler = new StuInvocationHandler<Person>(zhangsan);
        //创建一个代理对象stuProxy来代理张三，代理对象的每个执行方法都会替换执行Invacation中invocake方法
        Person stuproxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),new Class[]{Person.class},stuHandler);
        //代理执行上交班费方法
        stuproxy.giveMoney();

        System.out.println("==测试==="+testReturn());
    }


    public static int testReturn(){
       return test();
    }
    public static int test(){
        return 1;
    }
}
