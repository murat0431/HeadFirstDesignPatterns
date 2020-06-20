package Chapter_7.adapter;

import java.util.Iterator;

public class BrandNew {
    private Iterator it;

    public BrandNew(Iterator it) {
        this.it = it;
    }

    public void myMethod() {
        it.next();
        it.hasNext();
    }
}
