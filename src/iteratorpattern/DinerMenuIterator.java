package iteratorpattern;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0 ;  //position 记录当前数组遍历的位置

    public DinerMenuIterator(MenuItem[] items){ //菜单数组当做参数
        this.items = items ;
    }

    @Override
    public boolean hasNext() {
        //是固定长度，所有不近看索引是否到最后，还要看期间是否null（未填充数据源的）
        if (position>=items.length || items[position]==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position +1;
        return  menuItem ;
    }
}
