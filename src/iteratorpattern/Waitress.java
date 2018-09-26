package iteratorpattern;

/**
 * 菜单已经封装起来了，女招待不知道  菜单  是如何存储菜单项集合的
 *
 * 女招待仍然捆绑具体的类（dineMenu），需要修改。
 */
public class Waitress {
    DineMenu dineMenu ;

    public Waitress(DineMenu dineMenu){//构造器传入两个菜单
        this.dineMenu = dineMenu ;
    }
    public void printMenu(){
        Iterator dinerIterator = dineMenu.createIterator();//为每一个菜单各自创建一个迭代器
        System.out.println("===========");
        printMenu(dinerIterator);//调用重载的printMenu()
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println("一个菜名="+menuItem.getName());
            System.out.println("一个菜描述="+menuItem.getDes());
        }
    }
}
