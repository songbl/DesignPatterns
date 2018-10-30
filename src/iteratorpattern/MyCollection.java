package iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MyCollection<T> {
    private List<T> list = new ArrayList<>();
    public void add(T item){
        list.add(item);
    }
    public void remove(T item){
        list.remove(item);
    }
    public Iterator createIterator(){
        return  new MyIteator(list);
    }
}
