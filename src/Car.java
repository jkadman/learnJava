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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
