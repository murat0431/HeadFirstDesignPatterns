package Chapter_1;

/**
 * @author murat
 */
public abstract class Duck {
    public void quack() {
        System.out.println("Quack Quack");
    }

    public void swim() {
        System.out.println("Swim swim");
    }
    public abstract void display();

    public void fly() {
        System.out.println("I can fly");
    }
}
