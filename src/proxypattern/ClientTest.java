package proxypattern;

public class ClientTest {

    public static void main(String[] args) {
        RealSubject real = new RealSubject();
        ProxySubject proxy = new ProxySubject(real);
        proxy.operate();
    }


}
