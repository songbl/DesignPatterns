package iteratorpattern;

/**
 * 第一版本情况：
 *
 * 通过迭代器改写餐厅菜单
 */
public class DineMenu {
    static final int MAX_ITEMS = 6 ;
    int numberOfItems = 0 ;
    MenuItem [] menuItems ;

    /**
     * 回迭代器接口。客户不需要早知道餐厅菜单图和维护菜单项，也不需要知道迭代器
     * 如何实现，客户只需要直接使用这个迭代器遍历菜单项即可。
     */

    public DineMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("酸溜土豆丝","美味极了");
        addItem("白菜炖肉","山东大白菜，10年老猪头");

    }
    public void addItem(String name, String des){
        MenuItem menuItem = new MenuItem(name,des);
        if (numberOfItems >MAX_ITEMS){
            System.out.println("菜品太多，放不开了....");
        }else {
            menuItems[numberOfItems] = menuItem ;
            numberOfItems = numberOfItems+1;
        }
    }
    public Iterator createIterator(){//从菜单数组创建一个
        return new DinerMenuIterator(menuItems);
    }
}
