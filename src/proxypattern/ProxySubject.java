package proxypattern;
//代理主题类-->代理类

/**
 * 代理模式为另一个对象提供一个替身或者占位符，以控制这个对象的访问
 */
public  class ProxySubject extends Subject{
    private Subject mSubject;

    public ProxySubject(Subject subject){
        mSubject = subject;
    }
    @Override
    public void operate() {
        System.out.println("通过代理控制对象了...");
        mSubject.operate();
    }
}
