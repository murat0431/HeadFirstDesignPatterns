package Chapter_3;

import Chapter_3.components.DarkRoast;
import Chapter_3.decorators.Milk;
import Chapter_3.decorators.Mocha;
import Chapter_3.decorators.Soy;

import java.io.InputStream;

public class Driver {
    public static void main(String[] args) {
        Beverage bev = new Milk(new Mocha(new Mocha(new Soy(new DarkRoast()))));
        System.out.println(bev.cost() + " " + bev.getDescription());

    }
}
