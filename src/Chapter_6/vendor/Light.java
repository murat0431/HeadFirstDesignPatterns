package Chapter_6.vendor;

public class Light {
    private boolean isOn;
    public Light() {
        isOn = false;
    }
    public void on() {
        isOn=true;
        System.out.println("Light is on!");
    }

    public void off() {
        isOn=false;
        System.out.println("Light is off!");
    }

    public void status() {
        String temp = "LIGHT IS: ";
        if (isOn) {
            System.out.println(temp + "ON");
        } else {
            System.out.println(temp + "OFF");
        }
    }
}
