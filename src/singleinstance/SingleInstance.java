package singleinstance;


/**
 *  单件模式：确保一个类只有一个实例，并提供能一个全局访问点
 */
public class SingleInstance {
    private static SingleInstance singleInstance ;
    private SingleInstance(){}

    /**
     * 如果synchronized加在方法上，每次都要走，降低性能
     * 而且只有第一次的时候，确实有用，累赘
     * 1）因为A和B是第一批调用者，当它们进入静态工厂方法时，instance变量是null。因此它们几乎同时到达 位置2。
     * 2)  假设A线程先进入 synchronized (SingleInstance.class)，到达位置3，这时由于同步机制，线程B无法到达位置3，只能在位置2等待。
     * 3）singleInstance = new SingleInstance()语句，使得instance引用指向一个对象。此时线程B还在位置2上等待。
     * 4）线程A退出synchronized (instance)，singleInstance，退出静态工厂方法。
     * 5）线程B进入 synchronized (instance)块，达到位置3，此时instance已经不为null，因此线程B退出synchronized (instance)
     * @return
     */
    public static SingleInstance getSingleInstance(){
        //位置1
        if (singleInstance==null){
            //位置2
            synchronized (SingleInstance.class){
                //位置3
                if (singleInstance==null){
                    //位置4
                    singleInstance = new SingleInstance();
                }
            }

        }
        return singleInstance;
    }
}
