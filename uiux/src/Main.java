import java.util.Scanner;
public class Main {


        public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the main menu
            System.out.println("E-Waste Management System");
            System.out.println("1. Add E-Waste Item");
            System.out.println("2. View E-Waste Inventory");
            System.out.println("3. Dispose of E-Waste");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Add E-Waste Item
                    System.out.print("Enter the name of the item: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter the type of the item (e.g., smartphone, laptop, etc.): ");
                    String itemType = scanner.nextLine();
                    // You can add more details like date of purchase, condition, etc.
                    // Store this information in your data structure or database.
                    System.out.println("Item added successfully!");
                    break;
                case 2:
                    // View E-Waste Inventory
                    // Retrieve and display the list of E-Waste items from your data structure or database.
                    // You can display details like name, type, date of purchase, condition, etc.
                    break;
                case 3:
                    // Dispose of E-Waste
                    System.out.print("Enter the name of the item to dispose of: ");
                    String itemToDispose = scanner.nextLine();
                    // Implement logic to remove the item from your data structure or database.
                    System.out.println("Item disposed of successfully!");
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Thank you for using the E-Waste Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
    }
   
