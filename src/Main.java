import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int[] test = {1, 2, 3, 4, 550};

    int[] test2 = {66, 70, 4, 100, 3, 55};
    int number = getMax(test);
    int number2 = getMax(test2);
        System.out.println(number);
        System.out.println(number2);
    }

    public static int getMax(int[] arr) {
        // only difference between my and his code is that he did:
        // int high = numbers[0];
        int high = 0;
        for (int num : arr) {
            if (num > high) {
                high = num;
            }
        }
        return high;
    }
}