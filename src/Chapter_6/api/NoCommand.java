package Chapter_6.api;

public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("No Command!");
    }

    @Override
    public void undo() {

    }
}
