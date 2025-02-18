import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator: ");

        int a = scanner.nextInt();
        String operator = scanner.next();
        int b = scanner.nextInt();

        if (operator.equals("plus")) {
            System.out.println(add(a, b));

        } else if (operator.equals("minus")) {
            System.out.println(subtract(a, b));

        } else {
            System.out.println("Invalid operator");

        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

}