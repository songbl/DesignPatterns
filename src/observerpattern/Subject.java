package observerpattern;

/**
 *  主题（被观察者）
 */
public interface Subject {

    public void registerObserver(Observer o);//以观察者作为参数，用来注册
    public void removeObserver(Observer o);//观察者为参数，用来删除
    public void notifyObserver();//当主题改变时，这个方法会被调用，通知所有的观察者
}
