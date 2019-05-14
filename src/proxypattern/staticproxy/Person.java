package proxypattern.staticproxy;


/**
 *  这个接口是学生（被代理类），和班长（代理类）的  公共接口，他们都有上交
 *  班费的行为。这样，学生上交班费可以通过班长代理
 */
public interface Person {
    //上缴班费
    void giveMoney();
}
