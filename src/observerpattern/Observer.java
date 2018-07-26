package observerpattern;

/**
 *  1.观察者接口，有收到通知更新的方法
 *  2.主题在状态改变的时候，会将这些值通过参数传递给观察者
 *  3.s所有的观察者都必须实现update方法，将数值传递进来
 */
public interface Observer {
    public void update(float temp,float hunidity,float pressure);//所有的观察者都会收到所有的数据
    public void updateByPull(Subject subject);//通过拉的形式更新，只获取观察者自己想要的
}
