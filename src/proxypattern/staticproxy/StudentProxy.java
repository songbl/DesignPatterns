package proxypattern.staticproxy;

/**
 * StudentProxy类，这个类实现了Person接口，但是还持有一个学生的对象。
 */

public class StudentProxy implements Person {
    Student stu ;

    public StudentProxy(Person stu) {
        if (stu.getClass()==Student.class)
        this.stu = (Student) stu;
    }



    //代理上交班费，调用被代理的学生方法（学生才是真正去触发的行为）
    @Override
    public void giveMoney() {
        //下面这句话就代表了，=====中间处理的过程=====，然后才去真正的执行。
        System.out.println("嗯，优秀优秀，交钱啦");
        stu.giveMoney();
    }
}
