public class Main {
    public static void main(String[] args) {
        // array: store multiple values in a variable
        int[] numbers = {12, 15, 60, 100, 200, 20, 50};
        // for each statement, different than in JS
        for (int number : numbers) {
            System.out.println(number);
        }

        // can also use index
        System.out.println("2nd element of numbers: " + numbers[1]);

        // classic loop, can use shortcut fori in intellij
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("This is number " + numbers[i]);
        }

        // have to add -1 if change i <= numbers.length
        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.println("This is also number " + numbers[i]);
        }

        String[] friends = {"Maria", "Alex", "Bita", "John", "Steve"};
        for (String friend : friends) {
            System.out.println(friend);
        }

    }
}