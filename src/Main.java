public class Main {
    public static void main(String[] args) {
        // OOP: way of writing code in the way we think about things in the world, take a car
        // state: what is the make, color of the car
        // functionality: the car can drive, change gears
        // objects need a template or plan

        // create new object called instantiation
            Car car = new Car("Tesla", "S PLAID", "BLACK", 4);
            Car car2 = new Car("Honda", "FIT", "SILVER", 4);

        System.out.println(car.getName());
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getDoors());
        System.out.println("\n");
        System.out.println(car2.getName());
        System.out.println(car2.getModel());
        System.out.println(car2.getColor());
        System.out.println(car2.getDoors());

        System.out.println("\n");
        car.setColor("Red");
        System.out.println(car.getColor());
    }
}