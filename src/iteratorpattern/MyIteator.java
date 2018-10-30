package iteratorpattern;

import java.util.Iterator;
import java.util.List;

public class MyIteator<T> implements Iterator{

   private List<T> list ;

  public   MyIteator(List<T> list) {
        this.list = list ;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }


}
