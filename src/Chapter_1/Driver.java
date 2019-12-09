package Chapter_1;

public class Driver {
    public static void main(String[] args) {
        Duck d = new RedHeadDuck();
        d.display();
        d.quack();

        Duck m = new MallardDuck();
        m.display();
        m.swim();

        m.fly();
        d.fly();
    }
}
