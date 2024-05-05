public class Main {
    public static void main(String[] args) {

        // some review: = is called assignment operator; == is called equality operators
        int age = 17;
        if (age >= 19) {
            System.out.println("Please come in and enjoy");
        } else {
            System.out.println("Your age is only " + age + "." + " Please come back in " + (19 - age) + " years!");
        }

    }
}