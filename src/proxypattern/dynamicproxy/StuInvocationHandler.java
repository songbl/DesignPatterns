package proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StuInvocationHandler<T> implements InvocationHandler {

    //invacationHander持有的被代理对象
    T target ;

    public StuInvocationHandler(T target) {
        this.target = target;
    }


    /**
     *
     * @param proxy     代表动态代理对象
     * @param method    代表正在执行的方法
     * @param args      代表调用目标方法时传入的实参
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      System.out.println("代理执行"+method.getName()+"方法");
        System.out.println("我加上一行，看看素有的代理真的执行这个统一的嘛....");
      //代理过程中插入监测的方法，计算该方法耗时
        TimeUtil.start();
        Object result = method.invoke(target,args);
        TimeUtil.finish(method.getName());
        return result;
    }
}
