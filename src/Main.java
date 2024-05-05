public class Main {
    public static void main(String[] args) {

        // some review: = is called assignment operator; == is called equality operators
        int age = 17;
        if (age >= 19) {
            System.out.println("Please come in and enjoy");
        } else {
            System.out.println("Your age is only " + age + "." + " Please come back in " + (19 - age) + " years!");
        }

        int year = 2024;

        if (year == 2024) {
            System.out.println("the year is " + year);
        } else if (year == 2025) {
            System.out.println("the year is " + year);
        } else {
            System.out.println("You exist outside of time");
        }

        boolean isActive = true;

        // doesn't require == true as we have declared isActive as true
        if (isActive) {
            System.out.println("You are active");
        } else {
            System.out.println("You are not active");
        }
        // reminder you can do !variable to indicate if a variable is false
//        if (!isActive) {
//            System.out.println("You are active");
//        } else {
//            System.out.println("You are not active");
//        }


        int score = 100;
        // could also use || for or
        if (score >= 100 && isActive) {
            System.out.println("You made it to the next level!");
        } else {
            System.out.println("You are close keep up the work");
        }
    }
}