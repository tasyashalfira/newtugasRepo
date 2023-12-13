import java.util.*;

public class Calcu {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextInt();

        System.out.print("Enter the desired operator (+, -, x, /): ");
        String operator = scanner.next();

        double result = 0;
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "x":
                result = number1 * number2;
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("The second number cannot be 0");
                    return;
                }
                result = number1 / number2;
                break;
            default:
                System.out.println("Unrecognized operator");
                return;
        }

        if (result == (int) result) {
            result = (int) result;
        }

        System.out.println("Result: " + result);
    }
}
