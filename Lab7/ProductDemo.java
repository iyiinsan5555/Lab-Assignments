import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user how many products
        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();
        scanner.nextLine(); //to prevent error. (tested)

        Product[] products = new Product[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Enter product " + (i+1) + " name: ");
            String name = scanner.nextLine();
            System.out.print("Enter product " + (i+1) + " stock: ");
            int stock = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            products[i] = new Product(name, stock);
        }


        while (true) {
            System.out.print("Enter product name to buy or 'Q' to quit: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            boolean found = false;
            for (Product p : products) { //enhanced for loop
                if (p.getName().equalsIgnoreCase(input)) {
                    p.buyOne();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("No such product!");
            }
        }


        System.out.println("\nFinal product info:");
        for (Product p : products) {
            p.printInfo();
        }

        scanner.close();
    }
}

