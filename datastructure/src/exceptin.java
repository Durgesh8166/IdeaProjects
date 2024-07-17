import java.util.Scanner;
public class exceptin {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the dividend: ");
            int dividend = scanner.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            try {
                int result = dividend / divisor;
                System.out.println("The result of division: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed");
            }
        }
    }

