import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the programming language and number: ");
        String input = scanner.nextLine();

        // Split the input string into language and number
        String[] parts = input.split("\\s+");
        String language = parts[0];
        int number = Integer.parseInt(parts[1]);

        System.out.println("Language: " + language);
        System.out.println("Number: " + number);

        scanner.close();
    }
}
