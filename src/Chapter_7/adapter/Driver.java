package Chapter_7.adapter;

import java.util.*;

public class Driver {
    public static void main(String[] args) {

        Iterator it = new EnumerationAdapter(new LegacyCode());
        BrandNew nw = new BrandNew(it);
        nw.myMethod();

    }
}
