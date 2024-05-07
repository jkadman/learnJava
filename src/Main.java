public class Main {
    public static void main(String[] args) {

        sayHello("Bob", 54);

        int max = getMax(62, 54);
        System.out.println(max);
    }

    public static void sayHello(String name, int age) {
        System.out.println("Hello " + name + "!" + " Your age is " + age);
    }

    public static int getMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}

