import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int[] test = {1, 2, 3, 4, 550};

    int[] test2 = {66, 70, 4, 100, 3, 55};
    int number = returnArr(test);
    int number2 = returnArr(test2);
        System.out.println(number);
        System.out.println(number2);
    }

    public static int returnArr(int[] arr) {
        int high = 0;
        for (int num : arr) {
            if (num > high) {
                high = num;
            }
        }
        return high;
    }
}