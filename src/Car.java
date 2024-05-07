public class Car {
    // fields that store a state of the car
    private String name;
    private String model;
    private String color;
    private int doors;

    // create a constructor with parameters
    public Car(String name, String model, String color, int doors) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.doors = doors;
    }
    // method
    public void move() {
        System.out.println("The car " + this.name + " is moving.");
    }

    public void stop() {
        System.out.println("The car " + this.name + " has stopped.");
    }
}
