public class Main {
    public static void main(String[] args) {

        // basic for loop
        for (int i = 0;  i <= 10; i++) {
            System.out.println("i = " + i);
        }
        // basic for loop decrement
        for (int j = 10; j >= 0; j--) {
            System.out.println("j = " + j);
        }
        // for loop with if statement and break
        for (int i = 0;  i <= 10; i++) {
            if (i == 6) {
                System.out.println("You hit the number 6");
                break;
            }
            System.out.println("i = " + i);
        }
        // with continue keyword
        for (int i = 0;  i <= 10; i++) {
            if (i == 6) {
                System.out.println("You hit the number 6");
                continue;
            }
            System.out.println("i = " + i);
        }

        int number = 0;
        while (number <= 10) {
            System.out.println("Your number is " + number);
            number++;
        }
        // will execute code at least once and then check condition

        int number2 = 0;
        do {
            System.out.println("This is number " + number2);
            number2++;
        } while (number2 <= 6);
    }
}