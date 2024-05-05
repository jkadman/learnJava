public class Main {
    //some code for committing
    public static void main(String[] args) {
        // String variable that can store text
        String name = "Alex";
        String name2 = "Fred";
        String name3 = "Boson";
        int num = 3;
        int age = 34;
        // maximum value that can be stored in an integer variable
        int maxValue = Integer.MAX_VALUE;
        // min value that can be stored in integer variable
        int minValue = Integer.MIN_VALUE;

        byte byteMaxValue = Byte.MAX_VALUE;
        byte byteMinValue = Byte.MIN_VALUE;

        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;

        // Java will see the max int value even if one defines the variable as long.  The way to get around this is to add and L to the end of the variable
        long myNumber = 2147483648L;

        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;

        // Two types of fractional numbers in Java: Float and Double.  Float has size of 32 bits, Double has size of 64 bits
        // Similar to the issue with long a number, such as 3.14, is assumed to be a double.  Must add F to the end to indicate you are using a Float.
        float flNum = 3.14F;
        double douNum = 2.456;

        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;

        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;

        // char data type lets you store one character, use '' for this one
        char letter = 'A';

        // boolean usually has a variable name that starts with the word is
        boolean isActive = true;

        System.out.println("Hello " + name +"!");
        System.out.println("Hello " + name2 +"!");
        System.out.println("Hello " + name3 +"!");
        System.out.println("This is the number " + num);
        System.out.println("This is " + name + " their name is " + age);
        System.out.println(maxValue);
        System.out.println(minValue);
        // if max plus one, you the integer moves to the minimum value
        System.out.println(maxValue + 1);

        System.out.println("Max Byte value: " + byteMaxValue);
        System.out.println("Min Byte value: " + byteMinValue);

        System.out.println("Max Long value: " + maxLongValue);
        System.out.println("Min Long value: " + minLongValue);

        System.out.println("Max Short value: " + maxShort);
        System.out.println("Min Short value: " + minShort);
        System.out.println("Float value: " + flNum);
        System.out.println("Double value: " + douNum);

        System.out.println("Max Float Value: " + maxFloat);
        System.out.println("Min Float Value: " + minFloat);

        System.out.println("Max Double Value: " + maxDouble);
        System.out.println("Min Double Value: " + minDouble);

        System.out.println("char data type: " + letter);
        System.out.println("boolean data type: " + isActive);
    }
}