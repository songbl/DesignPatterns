package proxypattern;

//真实主题类-->委托类
public class RealSubject extends Subject {

    @Override
    public void operate() {
        System.out.println("real subject");
    }
}