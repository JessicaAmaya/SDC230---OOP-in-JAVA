/**
 * Jessica Amaya
 * 2/6/2026
 * IC 2.5
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Amaya 2.5");
        System.out.println();
        double prod1 = 2.98;
        double prod2 = 4.50;
        double prod3 = 9.98;
        double prod4 = 4.49;
        double prod5 = 6.87;
        double totalSales = 0.00;
        int salesCount = 0;
        double averageTransAmount = 0.00;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the product number (1 - 5) or -999 to quit: ");
        int choice = input.nextInt();
        do {
            switch (choice) {
                case 1:
                    System.out.print("Enter Quantity Sold: ");
                    count = input.nextInt();
                    salesCount += count;
                    totalSales += (double) prod1 * count;
                    break;
                case 2:
                    System.out.print("Enter Quantity Sold: ");
                    count = input.nextInt();
                    salesCount += count;
                    totalSales += (double) prod2 * count;
                    break;
                case 3:
                    System.out.print("Enter Quantity Sold: ");
                    count = input.nextInt();
                    salesCount += count;
                    totalSales += (double) prod3 * count;
                    break;
                case 4:
                    System.out.print("Enter Quantity Sold: ");
                    count = input.nextInt();
                    salesCount += count;
                    totalSales += (double) prod4 * count;
                    break;
                case 5:
                    System.out.print("Enter Quantity Sold: ");
                    count = input.nextInt();
                    salesCount += count;
                    totalSales += (double) prod5 * count;
                    break;
                default:
                    System.out.println("Invalid product number. Please try again");
            }
        System.out.print("Please enter the product number (1 - 5) or -999 to quit: ");
        choice = input.nextInt();
        } while (choice != -999);
        System.out.printf("Final total sales: $%.2f%n", totalSales);
        averageTransAmount = (double) totalSales / salesCount;
        System.out.printf("Average Transaction Amount: $%.2f", averageTransAmount);
        input.close();
    }
}
