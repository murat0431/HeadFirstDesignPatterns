package Chapter_7.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter implements Iterator {
    private Enumeration en;

    public EnumerationAdapter(Enumeration en) {
        this.en = en;
    }
    @Override
    public boolean hasNext() {
        return en.hasMoreElements();
    }

    @Override
    public Object next() {
        return en.nextElement();
    }
}
