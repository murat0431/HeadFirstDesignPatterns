package Chapter_4.abstractfactory;

import Chapter_4.abstractfactory.shop.NYPizzaShop;
import Chapter_4.abstractfactory.shop.PizzaShop;

public class Driver {
    public static void main(String[] args) {
        PizzaShop ps = new NYPizzaShop();
        ps.order("veggie");
    }
}
