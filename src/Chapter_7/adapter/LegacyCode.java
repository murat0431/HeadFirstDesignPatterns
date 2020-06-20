package Chapter_7.adapter;

import java.util.Enumeration;

public class LegacyCode implements Enumeration {
    @Override
    public boolean hasMoreElements() {
        System.out.println("Old hasMoreElements()");
        return false;
    }

    @Override
    public Object nextElement() {
        System.out.println("Old nextElement()");
        return null;
    }
}
