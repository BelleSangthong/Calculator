import java.util.Scanner;

public class RecuCalculator {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator: ");

        double a = scanner.nextInt();
        String operator = scanner.next();
        double b = scanner.nextInt();

        switch (operator) {
            case "plus":
                System.out.println(recursiveAdd(a, b));
                break;
            case "minus":
                System.out.println(recursiveSubtract(a, b));
                break;
            case "multiply":
                System.out.println(recursiveMultiply(a, b));
                break;
            case "devide":
                System.out.println(recursiveDevide(a, b));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

    public static double recursiveAdd(double a, double b) {
        if (b <= 0) {
            return a;
        }
        return recursiveAdd(a + 1, b - 1);
    }

    public static double recursiveSubtract(double a, double b) {
        if (b <= 0) {
            return a;
        }
        return recursiveSubtract(a - 1, b - 1);
    }

    public static double recursiveMultiply(double a, double b) {
        if (b <= 0) {
            return 0;
        }
        return a + recursiveMultiply(a, b - 1);
    }

    public static double recursiveDevide(double a, double b) {
        if (b <= 0) {
            return 0;
        }
        return 1 + recursiveDevide(a - b, b);
    }
}
