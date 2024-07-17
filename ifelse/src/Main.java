import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        String result = "";

        if (n % 2 == 1) {
            result = "Weird";
        } else {
            if (n >= 2 && n <= 5) {
                result = "Not Weird";
            } else if (n >= 6 && n <= 20) {
                result = "Weird";
            } else {
                result = "Not Weird";
            }
        }

        System.out.println(result);
    }
}
