import java.util.Scanner;

public class BurritoKing {
    // Define initial prices for items
    private static double burritoPrice = 7.0;
    private static double friesPrice = 4.0;
    private static double sodaPrice = 2.5;

    // Initialize quantities and sales
    private static int friesLeft = 0;
    private static int burritoSales = 0;
    private static int friesSales = 0;
    private static int sodaSales = 0;
    private static double totalSales = 0.0;

    // Initialize scanner for user input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Main loop for user interaction
        while (true) {
            // Display main menu
            System.out.println("==================================================");
            System.out.println("Burrito King");
            System.out.println("==================================================");
            System.out.println("a) Order");
            System.out.println("b) Sales Report");
            System.out.println("c) Update prices");
            System.out.println("d) Exit");

            // Prompt user for choice
            System.out.print("Please select: ");
            String choice = scanner.nextLine();

            // Process user choice
            switch (choice.toLowerCase()) {
                case "a":
                    order(); // Order food
                    break;
                case "b":
                    showSalesReport(); // Show sales report
                    break;
                case "c":
                    updatePrices(); // Update prices
                    break;
                case "d":
                    System.out.println("Thank You, Bye Bye Customer"); // Exit program
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again."); // Invalid input
            }
        }
    }

    // Method to handle ordering food
    private static void order() {
        double totalCost = 0.0; // Initialize total cost

        while (true) {
            // Display food menu
            System.out.println("Select the food item");
            System.out.println("1. Burrito");
            System.out.println("2. Fries");
            System.out.println("3. Soda");
            System.out.println("4. No more");

            // Prompt user for choice
            System.out.print("Please select: ");
            String itemChoice = scanner.nextLine();

            // Process user choice
            switch (itemChoice) {
                case "1":
                    orderBurrito(totalCost); // Order burrito
                    break;
                case "2":
                    orderFries(totalCost); // Order fries
                    break;
                case "3":
                    orderSoda(totalCost); // Order soda
                    break;
                case "4":
                    checkout(totalCost); // Proceed to checkout
                    return;
                default:
                    System.out.println("Invalid choice, please try again."); // Invalid input
            }
        }
    }

    // Method to handle ordering a burrito
    private static void orderBurrito(double totalCost) {
        System.out.print("How many burritos would you like to buy: ");
        int burritoQuantity = Integer.parseInt(scanner.nextLine()); // Get quantity
        totalCost += burritoPrice * burritoQuantity; // Calculate cost
        burritoSales += burritoQuantity; // Update sales
    }

    // Method to handle ordering fries
    private static void orderFries(double totalCost) {
        if (friesLeft == 0) { // Check if fries need to be cooked
            System.out.println("Cooking Fries; please be patient dear customer");
            friesLeft += 5; // Cook fries
        }
        System.out.print("How many serves of fries would you like to buy: ");
        int friesQuantity = Integer.parseInt(scanner.nextLine()); // Get quantity
        if (friesQuantity > friesLeft) { // Check availability
            System.out.println("Sorry, not enough fries available.");
            friesQuantity = friesLeft; // Limit quantity
        }
        friesLeft -= friesQuantity; // Update available fries
        totalCost += friesPrice * friesQuantity; // Calculate cost
        friesSales += friesQuantity; // Update sales
        System.out.println(friesLeft + " serves of fries left for next order");
    }

    // Method to handle ordering soda
    private static void orderSoda(double totalCost) {
        System.out.print("How many sodas would you like to buy: ");
        int sodaQuantity = Integer.parseInt(scanner.nextLine()); // Get quantity
        totalCost += sodaPrice * sodaQuantity; // Calculate cost
        sodaSales += sodaQuantity; // Update sales
    }

    // Method to handle checkout
    private static void checkout(double totalCost) {
        System.out.println("Total cost is $" + totalCost); // Display total cost
        double paidAmount = 0.0; // Initialize paid amount
        do {
            System.out.print("Please enter money: ");
            paidAmount = Double.parseDouble(scanner.nextLine()); // Get paid amount
            if (paidAmount < totalCost)
                System.out.println("Sorry, that's not enough to pay for the order."); // Insufficient payment
        } while (paidAmount < totalCost);
        double change = paidAmount - totalCost; // Calculate change
        System.out.println("Change returned: $" + change); // Display change
        int totalTime = burritoSales * 9 + (friesSales > 0 ? 8 : 0); // Calculate total time
        System.out.println("Time taken: " + totalTime + " minutes"); // Display total time
        totalSales += totalCost; // Update total sales
    }

    // Method to display sales report
    private static void showSalesReport() {
        // Display sales report
        System.out.println("==================================================");
        System.out.println("Burrito King");
        System.out.println("==================================================");
        System.out.println("a) Order");
        System.out.println("b) Show sales report");
        System.out.println("c) Update prices");
        System.out.println("d) Exit");

        System.out.println("Unsold Serves of Fries: " + friesLeft); // Display remaining fries
        System.out.println("Total Sales:");
        System.out.println("Burritos: " + burritoSales + "\t$" + (burritoSales * burritoPrice)); // Display burrito sales
        System.out.println("Fries: " + friesSales + "\t$" + (friesSales * friesPrice)); // Display fries sales
        System.out.println("Soda: " + sodaSales + "\t$" + (sodaSales * sodaPrice)); // Display soda sales
        System.out.println("--------------------------------------------------");
        System.out.println("Total: " + (burritoSales + friesSales + sodaSales) + "\t$" + totalSales); // Display total sales
        System.out.println("==================================================");
    }

    // Method to update prices
    private static void updatePrices() {
        // Update prices
        System.out.println("Enter new price for burrito: ");
        burritoPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter new price for fries: ");
        friesPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter new price for soda: ");
        sodaPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Prices updated successfully.");
    }
}
