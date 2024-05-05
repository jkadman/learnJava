public class Main {
    public static void main(String[] args) {
        float num1 = 5f;
        int num2 = 6;
        double num3 = 5;



        // operator things which performs operation ie: +, -, * etc
        // operands things that are use by operators: float, int etc
        // operations follows order of bedmas

        System.out.println("adding: " + num1 + num2);
        System.out.println("subtracting: " + (num1 - num2));
        System.out.println("multiplying" + num1 * num2);
        System.out.println("dividing with float: " + num1 / num2);
        System.out.println("dividing with double: " + num3 / num2);
        System.out.println("modulo: " + num1 % num2);

        int myNumber = 12;
        myNumber += 4;
        System.out.println(myNumber);

        myNumber -= 7;
        System.out.println(myNumber);

        myNumber /= 4;
        System.out.println(myNumber);

        myNumber *= 4;
        System.out.println(myNumber);

        // post fix incrementation, prints original value and then increments it
        int myNumber2 = 3;
        System.out.println("postfix incrementation: " + myNumber2++);
        System.out.println("After incrementation: " + myNumber2);

        // can also do prefix incrementation, increments and returns
        System.out.println("prefix incrementation: " + ++myNumber2);

        // can also do prefix decrementation
        System.out.println("prefix decrementation: " + --myNumber2);

    }
}