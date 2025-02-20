import java.util.Scanner;

public class Calculator {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator: ");

        double a = scanner.nextInt();
        String operator = scanner.next();
        double b = scanner.nextInt();

        switch (operator) {
            case "plus":
                System.out.println(add(a, b));
                break;
            case "minus":
                System.out.println(subtract(a, b));
                break;
            case "multiply":
                System.out.println(multiply(a, b));
                break;
            case "devide":
                System.out.println(devision(a, b));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double devision(double a, double b) {
        return a / b;
    }


}
