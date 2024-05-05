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
    }
}